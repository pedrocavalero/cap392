package com.pedrocavalero.cap392.eventos;

public class EventGeneratorTimer implements EventGenerator{

	private String message;
	protected EventMediator mediator;
	
	public EventGeneratorTimer(String message, EventMediator mediator) {
		this.message = message;
		this.mediator = mediator;
	}
	@Override
	public void start() {
		new Thread(() -> {
			while(true){
				send(EventFactory.createMessage(prepareMessage(), this));
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
		mediator.send(event);
	}

}
