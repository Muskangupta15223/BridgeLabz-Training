package com.tree.binarysearchtree.ecommerceproductinvertory;

public class ECommerceInvertoryBST {
	
	//insert product
	public ProductNode insert(ProductNode root, int sku, String name, double price) {
		if(root == null) 
			return new ProductNode(sku,name,price);
		if(sku < root.sku) {
			root.left = insert(root.left, sku, name, price);
		}else if(sku > root.sku) {
			root.right = insert(root.right, sku, name, price);
		}
		return root;
	}
	
	// search product
	public ProductNode search(ProductNode root, int sku) {
		if(root == null || root.sku == sku)
			return root;
		if( sku < root.sku) 
			return search(root.left, sku);
		else 
			return search(root.right, sku);
	}	
	
	// update product price 
	  public void update(ProductNode root, int sku, double newPrice) {
		  ProductNode item = search(root, sku);
		  if(item != null) {
			  item.price = newPrice;
			  System.out.println("Updated successfully\n");
		  }else {
			  System.out.println("Not Found");
		  }
	  }
	  
	  // DISPLAY products in sorted SKU order
	    public void inorder(ProductNode root) {
	        if (root == null) return;

	        inorder(root.left);
	        System.out.println("SKU: " + root.sku +
	                ", Name: " + root.name +
	                ", Price: ₹" + root.price);
	        inorder(root.right);
	    }
}
