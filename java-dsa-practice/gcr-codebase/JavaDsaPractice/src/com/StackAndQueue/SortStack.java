package com.StackAndQueue;
import java.util.*;
public class SortStack {
	
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Helper function to insert element at correct position
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if ((stack.isEmpty()) || (stack.peek() <= value)) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, value);	
        stack.push(top);
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
