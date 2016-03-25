package com.pedrocavalero.cap392.eventos;

public class EventFactory {

	public static Event createMessage(String message, EventGenerator source) {
		return new BasicEvent(message, source);
	}

	
}
