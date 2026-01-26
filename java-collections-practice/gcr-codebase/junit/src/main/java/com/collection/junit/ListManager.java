package com.collection.junit;
import java.util.*;
public class ListManager {

	public void addElement(List<Integer> list, int element) {
		list.add(element);
	}
	
	public void removeElement(List<Integer> list, int element) {
		if(list.contains(element)) {
			list.remove(Integer.valueOf(element));
		}
		else {
			System.out.println("Element not found in the list");
		}
	}
	public int getSize(List<Integer> list) {
		return list.size();
	}
}
