package com.tree.binarysearchtree.universitydigitalrecord;

public class UniversityBST {

	// add student
	public static StudentNode insert(StudentNode root, int rollNo, String name) {
		if(root == null)
			return new StudentNode(rollNo, name);
	
		if(rollNo < root.rollNo) {
			root.left = insert(root.left, rollNo, name);
		}
		else if (rollNo > root.rollNo) {
			root.right = insert(root.right, rollNo, name);
		}
		return root;
	}
	
	//search student
	public static StudentNode search(StudentNode root, int rollNo) {
		if(root == null || root.rollNo == rollNo) {
			return root;
		}
		if(rollNo < root.rollNo) {
			return search(root.left, rollNo);
		}else{
			return search(root.right, rollNo);
		}
	}
	
	//delete student
	
	public static StudentNode delete(StudentNode root, int rollNo) {
		if(root == null) return null;
		if(rollNo < root.rollNo) {
			root.left = delete(root.left, rollNo);
		}else if(rollNo > root.rollNo) {
			root.left = delete(root.right, rollNo);
		}else {
			// node have 0 or 1 child
			if(root.left == null) 
				return root.right;
			else if( root.right == null)
				return root.left;
			
			// node have 2 child
			StudentNode succ = findMin(root.right);
			root.rollNo = succ.rollNo;
			root.name = succ.name;
			root.right = delete(root.right, succ.rollNo);
		}
		return root;
	}
	// find minimum
	public static StudentNode findMin(StudentNode node) {
		while(node.left != null) {
			node = node.left;
		}
		return node;
	}
	
	// Inorder traversal
	public static void inorder(StudentNode root) {
		if(root == null) return;
		inorder(root.left);
		System.out.println(root.rollNo + " " + root.name);
		inorder(root.right);
	}
}
