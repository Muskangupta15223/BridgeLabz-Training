package com.collection.junit;
import java.util.*;
import org.junit.jupiter.api.*;

public class ListManagerTest {

	ListManager listManager = new ListManager();
	
	@Test
	void addElementTest() {
			List<Integer>l1 = new ArrayList<>(List.of(1,2,3,4,5));
			listManager.addElement(l1,6);
			List<Integer>expected = List.of(1,2,3,4,5,6);
		Assertions.assertIterableEquals(expected,l1);
	}
	
	@Test
	void removeElementTest() {
			List<Integer>l1 = new ArrayList<>(List.of(10,20,30,40,50));
			listManager.removeElement(l1,30);
			List<Integer>expected = List.of(10,20,40,50);
		Assertions.assertIterableEquals(expected,l1 );
	}
	@Test
	void removeElementTest2() {
		List<Integer>l1 = new ArrayList<>(List.of(10,20,30,40,50));
		listManager.removeElement(l1,80);
		String expected = "Element not found in the list";
	Assertions.assertEquals(expected, "Element not found in the list");
}
	@Test
	void getSizeTest() {
		List<Integer>l1 = List.of(100,200,300,400);
		int expected = 4;
		Assertions.assertEquals(expected, listManager.getSize(l1));
	}
}
