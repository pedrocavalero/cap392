package com.pedrocavalero.cap392.eventos;

import java.util.ArrayList;
import java.util.List;

public class EventConsumerGenerator extends EventGeneratorTimerRandom implements EventConsumer{

	

	public EventConsumerGenerator(String message, boolean printTimeMessage) {
		super(message, printTimeMessage);
	}

	private List<Event> receivedEvents = new ArrayList<>();
	
	@Override
	public void receive(Event event) {
		receivedEvents.add(event);
		consumers.stream()
		.filter(ec -> !ec.equals(EventConsumerGenerator.this))
		.forEach(ec -> {
			receivedEvents.stream().forEach(ev -> ec.receive(ev));
		});
		
	}	
}
