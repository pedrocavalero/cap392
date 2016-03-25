package com.pedrocavalero.cap392.eventos;

public class Main {

	public static void main(String[] args) {

		EventMediator mediator = new EventMediator();
		EventConsumer ec1 = new EventConsumerString();
		EventConsumer ec2 = new EventConsumerCounter();
		EventConsumerGenerator eg = new EventConsumerGenerator(mediator);
		mediator.addConsumer(ec1);
		mediator.addConsumer(ec2);
		mediator.addConsumer(eg);
		
		EventGeneratorTimerRandom egtr = new EventGeneratorTimerRandom("Hello", true, mediator);
		egtr.start();
		
		
	}

}
