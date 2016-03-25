package com.pedrocavalero.cap392.eventos;

import java.util.ArrayList;
import java.util.List;

public class EventMediator {

	protected List<EventConsumer> consumers =new ArrayList<>();

	public void addConsumer(EventConsumer ec) {
		consumers.add(ec);
	}

	public void send(Event event) {
		consumers.stream()
		.filter(ec -> !ec.equals(event.getSource()))
		.forEach(ec -> ec.receive(event));		
	}
}
