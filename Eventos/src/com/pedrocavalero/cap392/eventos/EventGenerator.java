package com.pedrocavalero.cap392.eventos;

public interface EventGenerator {

	void start();
	void send(Event event);
	void addConsumer(EventConsumer ec);
}
