package com.functionalinterface.smartdevicecontrol;

public class Light implements IDevice {

	@Override
	public void turnOn() {
		System.out.println("Light is ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Light is OFF");
		
	}

}
