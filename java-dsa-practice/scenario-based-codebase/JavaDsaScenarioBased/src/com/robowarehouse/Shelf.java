package com.robowarehouse;

public class Shelf {
	    Package[] packages;
	    int count;

	    Shelf(int size) {
	        packages = new Package[size];
	        count = 0;
	    }

	    public void addPackage(Package newPkg) {
	        int i = count - 1;

	        // Insertion Sort logic
	        while (i >= 0 && packages[i].weight > newPkg.weight) {
	            packages[i + 1] = packages[i];
	            i--;
	        }

	        packages[i + 1] = newPkg;
	        count++;
	    }

	    public void displayShelf() {
	        System.out.print("Shelf Order (Ascending): ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(packages[i].weight + " ");
	        }
	        System.out.println();
	    }
	}
