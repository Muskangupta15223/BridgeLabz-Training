package com.constructors.levelone;

public class Book {
	
	String title;
	String author;
     double price;
     
     Book(){
    	 title="abc";
    	 author ="xyz";
    	 price = 0;
     }
     
	Book(String title, String author, double price){
			this.title = title;
			this.author = author;
			this.price = price;
	}
	 void display(){
		System.out.println(title + " "+ author + " " + price);
	}
	 public static void main(String[] args) {
			Book b = new Book("joo" , "hsjj" , 67.9);
			b.display();
			Book b1 = new Book();
		    b1.display();
		    System.out.println();
	 }
}
