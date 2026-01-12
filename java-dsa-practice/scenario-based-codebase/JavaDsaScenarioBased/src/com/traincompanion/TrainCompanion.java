package com.traincompanion;

public class TrainCompanion {

	    private Compartment head;
	    private Compartment tail;

	    // add compartment at end
	    public void addCompartment(String name) {
	        Compartment newComp = new Compartment(name);

	        if (head == null) {
	            head = tail = newComp;
	            return;
	        }
	        tail.next = newComp;
	        newComp.prev = tail;
	        tail = newComp;
	    }

	    // remove compartment by name
	    public void removeCompartment(String name) {
	        Compartment curr = head;

	        while (curr != null) {
	            if (curr.name.equals(name)) {

	                if (curr == head) {
	                    head = curr.next;
	                    if (head != null) head.prev = null;
	                } 
	                else if (curr == tail) {
	                    tail = curr.prev;
	                    if (tail != null) tail.next = null;
	                } 
	                else {
	                    curr.prev.next = curr.next;
	                    curr.next.prev = curr.prev;
	                }
	                return;
	            }
	            curr = curr.next;
	        }
	    }

	    // move forward
	    public void traverseForward() {
	        Compartment curr = head;
	        System.out.print("Forward: ");
	        while (curr != null) {
	            System.out.print(curr.name + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }

	    // move backward
	    public void traverseBackward() {
	        Compartment curr = tail;
	        System.out.print("Backward: ");
	        while (curr != null) {
	            System.out.print(curr.name + " ");
	            curr = curr.prev;
	        }
	        System.out.println();
	    }

	    // show adjacent compartments
	    public void showAdjacent(String name) {
	        Compartment curr = head;

	        while (curr != null) {
	            if (curr.name.equals(name)) {
	                String prev = (curr.prev != null) ? curr.prev.name : "None";
	                String next = (curr.next != null) ? curr.next.name : "None";

	                System.out.println("Previous: " + prev);
	                System.out.println("Current: " + curr.name);
	                System.out.println("Next: " + next);
	                return;
	            }
	            curr = curr.next;
	        }
	        System.out.println("Compartment not found");
	    }
	}
