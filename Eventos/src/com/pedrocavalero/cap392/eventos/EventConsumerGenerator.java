package com.pedrocavalero.cap392.eventos;

import java.util.ArrayList;
import java.util.List;

public class EventConsumerGenerator implements EventConsumer, EventGenerator{

	private EventMediator mediator;
	private List<Event> receivedEvents = new ArrayList<>();

	
	
	public EventConsumerGenerator(EventMediator mediator) {
		super();
		this.mediator = mediator;
	}



	@Override
	public void receive(Event event) {
		receivedEvents.add(event);
		receivedEvents.stream().forEach(ev -> send(ev));
	}



	@Override
	public void start() {
	}



	@Override
	public void send(Event event) {
		event.setSource(this);
		mediator.send(event);		
	}	
}
