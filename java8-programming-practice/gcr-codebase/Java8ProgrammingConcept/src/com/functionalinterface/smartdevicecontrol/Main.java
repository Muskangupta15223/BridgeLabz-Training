package com.functionalinterface.smartdevicecontrol;

public class Main {

	public static void main(String args[]) {
		
		AC ac = new AC();
		Television tv = new Television();
		Light light = new Light();
		
		ac.turnOff();
		light.turnOn();
		tv.turnOn();
		
	}
}
