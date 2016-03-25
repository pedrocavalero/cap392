package com.pedrocavalero.cap392.eventos;

public class Main {

	public static void main(String[] args) {

		EventConsumer ec1 = new EventConsumerString();
		EventConsumer ec2 = new EventConsumerCounter();
		EventConsumerGenerator eg = new EventConsumerGenerator("Hello World!", true);
		//eg.addConsumer(ec1);
		eg.addConsumer(ec2);
		eg.addConsumer(eg);
		eg.start();
		
		
	}

}
