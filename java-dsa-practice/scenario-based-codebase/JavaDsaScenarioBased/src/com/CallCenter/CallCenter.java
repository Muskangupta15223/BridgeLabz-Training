package com.CallCenter;
import java.util.*;

public class CallCenter {
	    // Normal customer queue
	    private Queue<Customer> normalQueue = new LinkedList<>();

	    // VIP priority queue (earlier call gets higher priority)
	    private PriorityQueue<Customer> vipQueue =
	            new PriorityQueue<>(Comparator.comparingLong(c -> c.callTime));

	    // Customer call count per month
	    private HashMap<String, Integer> callCountMap = new HashMap<>();

	    // Receive incoming call
	    public void receiveCall(Customer customer) {

	        // Update call count
	        callCountMap.put(customer.id,
	                callCountMap.getOrDefault(customer.id, 0) + 1);

	        // Add to appropriate queue
	        if (customer.isVIP) {
	            vipQueue.offer(customer);
	            System.out.println("⭐ VIP Call received from " + customer.name);
	        } else {
	            normalQueue.offer(customer);
	            System.out.println("Call received from " + customer.name);
	        }
	    }

	    // Handle next call
	    public void handleCall() {

	        Customer customer;

	        if (!vipQueue.isEmpty()) {
	            customer = vipQueue.poll();
	            System.out.println("Handling VIP customer: " + customer.name);
	        } else if (!normalQueue.isEmpty()) {
	            customer = normalQueue.poll();
	            System.out.println("Handling customer: " + customer.name);
	        } else {
	            System.out.println("No calls in queue");
	            return;
	        }

	        System.out.println("Total calls this month by "
	                + customer.name + ": " + callCountMap.get(customer.id));
	    }
  }

