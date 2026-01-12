package com.ambulanceroute;

public class AmbulanceRoute {

	private HospitalUnit head = null;
	// Add unit to circular route
	public void addUnit(String name, boolean available) {
     HospitalUnit newUnit = new HospitalUnit(name, available);

     	if (head == null) {
     		head = newUnit;
     		newUnit.next = head;
     		return;
     	}

     	HospitalUnit temp = head;
     	while (temp.next != head) {
     		temp = temp.next;
     	}

     	temp.next = newUnit;
     	newUnit.next = head;
   }

	// Find nearest available unit
	public void routePatient() {
		if (head == null) {
			System.out.println("No hospital units available");
			return;
		}

		HospitalUnit current = head;
		do {
			if (current.available) {
				System.out.println("Patient sent to: " + current.name);
				return;
			}
			System.out.println("Checking: " + current.name);
			current = current.next;
		} while (current != head);

		System.out.println("No unit available currently");
	}

	// Remove unit (maintenance)
	public void removeUnit(String name) {
		if (head == null) return;

		HospitalUnit curr = head;
		HospitalUnit prev = null;

		do {
			if (curr.name.equals(name)) {

				// Single node case
				if (curr == head && curr.next == head) {
					head = null;
				}
				// Head removal
				else if (curr == head) {
					HospitalUnit last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				}
				// Middle removal
				else {
					prev.next = curr.next;
				}

				System.out.println("Unit removed (Maintenance): " + name);
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
	}

	// Display route
	public void displayRoute() {
		if (head == null) return;

		HospitalUnit temp = head;
		System.out.print("Route: ");
		do {
			System.out.print(temp.name + " → ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(Back to Start)");
	}
}

