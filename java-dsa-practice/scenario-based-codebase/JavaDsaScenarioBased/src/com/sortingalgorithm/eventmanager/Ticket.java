package com.sortingalgorithm.eventmanager;

public class Ticket {

	private int ticketId;
	private int price;
	
	Ticket(int ticketId, int price){
		this.ticketId = ticketId;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getTicketId() {
		return ticketId;
	}
}
