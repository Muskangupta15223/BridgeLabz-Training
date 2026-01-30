package com.functionalinterface.smartdevicecontrol;

public class Television implements IDevice {

	@Override
	public void turnOn() {
		 System.out.println("TV is ON");
		
	}

	@Override
	public void turnOff() {
		 System.out.println("TV is OFF");
		
	}

}
