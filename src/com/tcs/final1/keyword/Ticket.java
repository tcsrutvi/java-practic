package com.tcs.final1.keyword;

public class Ticket {// immutable
	private final String movie = "Sholay";
	private float price;

	public final void sell() { //don't want to be overridden

	}
	public final void sell(float price) { //don't want to be overridden

	}
}

class IllegalTicket extends Ticket {
	public final void sell() {

	}
}