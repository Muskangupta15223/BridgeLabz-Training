package com.tree.binarysearchtree.universitydigitalrecord;

public class UniversityMain {

	public static void main(String args[]) {
		StudentNode root = null;
		
		root = UniversityBST.insert(root, 91, "Amit");
		root = UniversityBST.insert(root, 29, "Amiska");
		root = UniversityBST.insert(root, 23, "Muskan");
		root = UniversityBST.insert(root, 42, "Ragini");
		root = UniversityBST.insert(root, 35, "Karan");
		root = UniversityBST.insert(root, 67, "Manav");
		root = UniversityBST.insert(root, 17, "Raghav");
		root = UniversityBST.insert(root, 89, "Afroz");
		
		System.out.println("Display Student Records");
		UniversityBST.inorder(root);
		
		 System.out.println("\n Searching for Roll No 40:");
	        StudentNode result = UniversityBST.search(root, 42);
	        if (result != null)
	            System.out.println("Found: " + result.rollNo + " - " + result.name);
	        else
	            System.out.println("Student not found");
	        
	        System.out.println("\n Delete roll no 17");
	        root = UniversityBST.delete(root,17);
	
	        System.out.println("\n Record after deletion");
	        UniversityBST.inorder(root);
	}
}
