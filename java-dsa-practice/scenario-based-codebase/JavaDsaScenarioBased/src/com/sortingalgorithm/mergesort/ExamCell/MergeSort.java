package com.sortingalgorithm.mergesort.ExamCell;
import java.util.*;
public class MergeSort {

	public static void mergeSort(List<Student> list, int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;
			mergeSort(list, l, m);
			mergeSort(list, m+1, r);
			
			merge(list, l, m, r);
		}
	}
	
	private static void merge(List<Student> list, int l,int m ,int r) {
		
		List<Student>L = new ArrayList<>();
		List<Student>R= new ArrayList<>();
		
		for(int i = l; i <= m; i++) {
			L.add(list.get(i));
		}
		for(int j = m+1; j < r; j++) {
			L.add(list.get(j));
		}
		int i = 0, j = 0, k = l;
		while( i < L.size() && j < R.size()) {
			if(L.get(i).getScore() >= R.get(i).getScore()) {
				list.set(k++, L.get(i++));
			}else {
				list.set(k++,  R.get(j++));
			}
		}
	}
}
