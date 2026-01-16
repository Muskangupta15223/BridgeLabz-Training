package com.robowarehouse;

public class Main {
	    public static void main(String[] args) {

	        Shelf shelf = new Shelf(10);

	        shelf.addPackage(new Package(12));
	        shelf.addPackage(new Package(4));
	        shelf.addPackage(new Package(20));
	        shelf.addPackage(new Package(8));
	        shelf.addPackage(new Package(15));

	        shelf.displayShelf();
	    }
	}

