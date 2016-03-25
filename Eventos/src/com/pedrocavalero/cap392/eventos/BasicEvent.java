package com.pedrocavalero.cap392.eventos;

public class BasicEvent implements Event {

	private String message;
	
	
	public BasicEvent(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}

}
