package com.smartcheckout;
import java.util.*;
public class Customer {
	
	private String name;
	private int custId;
	protected List<String>items;
	
	Customer(String name, int custId, List<String>items){
		this.name = name;
		this.custId = custId;
		this.items = new ArrayList<>(items);
	}
	
	   public List<String> getItems() {
	        return items;
	    }

	    public String getName() {
	        return name;
	    }
	    
	public void display() {
		System.out.println("custId :" + custId);
		System.out.println(items);
		System.out.println();
	}
}
