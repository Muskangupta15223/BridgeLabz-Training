package com.functionalinterface.cloningprototype;

public class VehiclePrototype  implements Cloneable {
	    private int id;
	    private String model;

	    public VehiclePrototype(int id, String model) {
	        this.id = id;
	        this.model = model;
	    }

	    public void display() {
	        System.out.println("ID: " + id + ", Model: " + model);
	    }

	    @Override
	    public Object clone() {
	        try {
	            return super.clone(); // shallow copy
	        } catch (CloneNotSupportedException e) {
	            throw new RuntimeException("Cloning not supported");
	        }
	    }
}
