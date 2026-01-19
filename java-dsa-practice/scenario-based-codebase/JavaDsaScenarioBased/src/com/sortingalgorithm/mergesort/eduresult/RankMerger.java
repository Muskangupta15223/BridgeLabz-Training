package com.sortingalgorithm.mergesort.eduresult;
public class RankMerger {

    public static Student[] merge(Student[] a, Student[] b) {

        Student[] result = new Student[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i].getScore() <= b[j].getScore()) { // stable
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}

