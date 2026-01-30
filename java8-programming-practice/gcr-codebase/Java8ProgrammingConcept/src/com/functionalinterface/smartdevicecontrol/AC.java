package com.functionalinterface.smartdevicecontrol;

public class AC implements IDevice{

	@Override
	public void turnOn() {
		 System.out.println("AC is ON");
		
	}

	@Override
	public void turnOff() {
		 System.out.println("AC is Off");
		
	}

}
