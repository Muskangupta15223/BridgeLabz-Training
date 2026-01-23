package com.tree.binarysearchtree.ecommerceproductinvertory;

public class ECommerceMain {
	 public static void main(String[] args) {
	        ProductNode root = null;
	        ECommerceInvertoryBST eci = new ECommerceInvertoryBST();
	        // Adding products
	        root = eci.insert(root, 105, "Laptop", 65000);
	        root = eci.insert(root, 102, "Mobile", 25000);
	        root = eci.insert(root, 108, "Headphones", 3000);
	        root = eci.insert(root, 101, "Keyboard", 1500);
	        root = eci.insert(root, 104, "Mouse", 800);

	        // Scenario 3: Sorted product list
	        System.out.println(" Display Product Inventory:");
	        eci.inorder(root);

	        // Scenario 1: Lookup
	        System.out.println("\n Searching product with SKU 104:");
	        ProductNode p = eci.search(root, 104);
	        if (p != null)
	            System.out.println("Found → " + p.name + ", Price: ₹" + p.price);
	        else
	            System.out.println("Product not found");

	        // Scenario 2: Price Update
	        System.out.println("\n Updating price for SKU 102:");
	        eci.update(root, 102, 23000);

	        // Display after update
	        System.out.println("\n Inventory After Price Update:");
	        eci.inorder(root);
	    }
	}
	