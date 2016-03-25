package com.pedrocavalero.cap392.eventos;

public interface Event {

	EventGenerator getSource();
	void setSource(EventGenerator eg);
	String getMessage();
}
