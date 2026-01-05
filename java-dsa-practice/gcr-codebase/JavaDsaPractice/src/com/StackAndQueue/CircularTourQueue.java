package com.StackAndQueue;
import java.util.*;
public class CircularTourQueue {

	    public static int findStart(int[] petrol, int[] distance) {

	        Queue<Integer> queue = new LinkedList<>();
	        int currentPetrol = 0;

	        for (int i = 0; i < petrol.length; i++) {

	            queue.offer(i);
	            currentPetrol += petrol[i] - distance[i];

	            if (currentPetrol < 0) {
	                queue.clear();
	                currentPetrol = 0;
	            }
	        }

	        if (!queue.isEmpty()) {
	            return queue.peek();
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        int[] petrol = {4, 6, 7, 4};
	        int[] distance = {6, 5, 3, 5};

	        System.out.println(findStart(petrol, distance));
	    }
	}
