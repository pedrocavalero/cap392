package com.pedrocavalero.cap392.eventos;

public class BasicEvent implements Event {

	private String message;
	private EventGenerator eventGeneratorSource;
	
	

	public BasicEvent(String message, EventGenerator eventGeneratorSource) {
		super();
		this.message = message;
		this.eventGeneratorSource = eventGeneratorSource;
	}


	@Override
	public String getMessage() {
		return message;
	}


	@Override
	public EventGenerator getSource() {
		return eventGeneratorSource;
	}


	@Override
	public void setSource(EventGenerator eg) {
		this.eventGeneratorSource = eg;
	}
	
	

}
