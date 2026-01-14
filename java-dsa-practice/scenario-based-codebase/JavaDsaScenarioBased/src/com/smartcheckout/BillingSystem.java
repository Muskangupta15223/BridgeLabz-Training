package com.smartcheckout;
import java.util.*;
public class BillingSystem {

	private Queue<Customer> customerQueue ;
	private ItemStore store;
	
	public BillingSystem(ItemStore store){
		this.store = store;
		customerQueue = new LinkedList<>();
	}
	
	public void addCustomer(Customer c) {
	       customerQueue.add(c);
	}
    public void processNextCustomer() {
        Customer c = customerQueue.poll();
        if (c == null) {
            System.out.println("No customers in queue");
            return;
        }
        int total = 0;
        for (String item : c.getItems()) {
            Integer price = store.priceMap.get(item);
            Integer stock = store.stockMap.get(item);

            if (price != null && stock != null && stock > 0) {
                total += price;
                store.stockMap.put(item, stock - 1);
            } else {
                System.out.println(item + " out of stock");
            }
        }

        System.out.println("Customer: " + c.getName());
        System.out.println("Total Bill: " + total);
    }
}
