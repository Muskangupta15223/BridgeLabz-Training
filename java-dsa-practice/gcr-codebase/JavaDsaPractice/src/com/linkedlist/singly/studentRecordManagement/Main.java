package com.linkedlist.singly.studentRecordManagement;

public class Main {
    public static void main(String[] args) {

        Student list = new Student();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Muskan", 21, 'B');
        list.addAtPosition(2, 3, "Amit", 19, 'C');

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nSearch Roll No 2:");
        list.searchByRollNo(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(3, 'A');

        System.out.println("\nAfter Update:");
        list.displayAll();

        System.out.println("\nDelete Roll No 1:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal List:");
        list.displayAll();
    }
}

