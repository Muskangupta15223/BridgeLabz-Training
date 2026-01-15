package com.sortingalgorithm.eventmanager;

public class Main {

	    public static void main(String[] args) {

	        Ticket[] tickets = {
	            new Ticket(1, 1500),
	            new Ticket(2, 800),
	            new Ticket(3, 1200),
	            new Ticket(4, 500),
	            new Ticket(5, 2000)
	        };

	        QuickSort.quicksort(tickets, 0, tickets.length - 1);

	        System.out.println("Sorted Tickets by Price (Ascending):");
	        for (Ticket t : tickets) {
	            System.out.println("Ticket ID: " + t.getTicketId()
	                    + " | Price: ₹" + t.getPrice());
	        }

	        System.out.println("\nTop Cheapest Tickets:");
	        for (int i = 0; i < Math.min(3, tickets.length); i++) {
	            System.out.println("₹" + tickets[i].getPrice());
	        }

	        System.out.println("\nTop Expensive Tickets:");
	        for (int i = tickets.length - 1; i >= Math.max(0, tickets.length - 3); i--) {
	            System.out.println("Price: ₹" + tickets[i].getPrice() + " | Id :" + tickets[i].getTicketId());
	        }
	    }
	}

