package com.pedrocavalero.cap392.eventos;

public class EventConsumerString implements EventConsumer{

	@Override
	public void receive(Event event) {
		System.out.println(event.getMessage());
	}

}
