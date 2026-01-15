package com.sortingalgorithm.bubblesort.hospitalqueue;
import java.util.*;
public class HospitalQueue {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total patients :");
		int n = sc.nextInt();
		sc.nextLine();
		
		Patient[] patients = new Patient[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter patients name:");
			String name = sc.nextLine();

			System.out.println("Enter bed name :");
			int criticality = sc.nextInt();
			sc.nextLine();
			
			patients[i] = new Patient(name, criticality);
		}
		
		BubbleSort b = new BubbleSort();
		b.bubblesort(patients);
		  for(Patient p : patients) {
	            System.out.println(p.name + " - " + p.criticality);
	        }
		sc.close();
	}
}
