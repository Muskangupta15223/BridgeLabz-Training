package com.lambdaexpression.smarthomelightautomation;

public class SmartHomeLight {

	public static void main(String[] args) {
		//Motion detected
		LightAction motionLight = () ->
		System.out.println("Motion detected! Soft Light ON.");
	
		//Time based (night)
		LightAction nightLight = () ->
		System.out.println("Nigt Time! Dim Yellow light ON ");
		
		//Voice commands
		LightAction voiceLight = () ->
		System.out.println("Voice command! Colorful light ON ");
		
		//ExecuteBehaviour
		motionLight.activate();
		nightLight.activate();
		voiceLight.activate();
	
	
	
	}
}
