package com.trafficmanager;
import java.util.*;
public class RoundAbout {

	private Vehicle head = null;
	private Vehicle tail = null;
	private int count = 0;
	private int capacity ;
	
	RoundAbout(int capacity){
		this.capacity = capacity;
	}
	public boolean isFull() {
		return count == capacity;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addVehicle(int id) {
		Vehicle newVehicle = new Vehicle(id);
		if(isEmpty()) {
			head = tail = newVehicle;
			tail.next = head;
		}else {
			tail.next = newVehicle;
			newVehicle.next = head;
			tail = newVehicle;
		}
		count++;
		System.out.println("Vehicle " + id + " entered roundabout");
	}
	
	public void removeVehicle(int id) {
		
		if(isEmpty()) {
			System.out.println("Roundabout Empty");
			return;
		}
		
		Vehicle curr = head;
		Vehicle prev = tail;
		
		do {
			if(curr.vehicleId == id) {
				
				if(head == tail) {
					head = tail = null;
				}else {
					prev.next = curr.next;
					if(curr == head) 
						head = curr.next;
					if(curr == tail)
						tail = prev;
				}
				
				count--;
	            System.out.println("Vehicle " + id + " exited roundabout");
	             return;
			}
			  prev = curr;
	            curr = curr.next;

	        } while (curr != head);

	        System.out.println("Vehicle not found");
	    }

	   // Print roundabout state
    public void printRoundabout() {
        if (isEmpty()) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.vehicleId + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to " + head.vehicleId + ")");
    }
}