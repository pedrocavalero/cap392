package com.pedrocavalero.cap392.eventos;

public class EventConsumerCounter implements EventConsumer{

	private int counter;
	@Override
	public void receive(Event event) {
		
		System.out.println("Msg n. "+ ++counter + ": " +  event.getMessage());
	}

}
