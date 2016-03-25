package com.pedrocavalero.cap392.eventos;

import java.util.ArrayList;
import java.util.List;

public class EventGeneratorTimer implements EventGenerator{

	protected List<EventConsumer> consumers;
	private String message;
	public EventGeneratorTimer(String message) {
		this.message = message;
		consumers = new ArrayList<>();
	}
	@Override
	public void start() {
		new Thread(() -> {
			while(true){
				send(EventFactory.createMessage(prepareMessage()));
				try {
					Thread.sleep(getWaitTimeMilis());
				} catch (Exception e) {
					System.out.println("Erro no envio");
				}
			}
		}).start();
	}
	protected String prepareMessage() {
		return message;
	}
	protected int getWaitTimeMilis() {
		return 5000;
	}
	public void send(Event event) {
		consumers.stream().forEach(ec -> ec.receive(event));
	}
	@Override
	public void addConsumer(EventConsumer ec) {
		consumers.add(ec);
	}

}
