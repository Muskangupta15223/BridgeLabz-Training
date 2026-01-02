package com.hospitalPatientManagementSystem;

public class Main {
	public static void main(String args[]) {
		Patient p1 = new InPatient(12, "Muskan", 22, "Typhoid", 10, 5);
		Patient p2 = new OutPatient(13, "Amit", 22, "Malaria", "15dec");
		

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor(2, "Dr. Pandey", "Surgeon");

        d1.consultPatient(p1);
        System.out.println("------------------------");
        d2.consultPatient(p2);


        Bill bill = new Bill(5000, 0.05, 500);
        System.out.println("Total Bill Amount: " + bill.calculatePayment());
    }
}

