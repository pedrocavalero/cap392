package com.pedrocavalero.cap392.eventos;

public class EventGeneratorTimerRandom extends EventGeneratorTimer{

	private boolean printTimeMessage;

	public EventGeneratorTimerRandom(String message, boolean printTimeMessage, EventMediator mediator) {
		super(message, mediator);
		this.printTimeMessage = printTimeMessage;
	}

	@Override
	protected int getWaitTimeMilis() {
		return (int)(Math.random()*10000);
	}
	
	@Override
	protected String prepareMessage() {
		return (printTimeMessage? "TimeCreated: " + System.currentTimeMillis() +": " : "")  + super.prepareMessage();
	}
}
