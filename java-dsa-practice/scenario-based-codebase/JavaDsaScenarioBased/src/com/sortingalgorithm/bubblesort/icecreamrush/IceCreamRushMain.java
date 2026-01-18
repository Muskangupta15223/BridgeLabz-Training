package com.sortingalgorithm.bubblesort.icecreamrush;

import java.util.Scanner;

public class IceCreamRushMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of icecreams:");
        int n = sc.nextInt();
        sc.nextLine();

        IceCream[] icecream = new IceCream[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter name of icecream:");
            String name = sc.nextLine();

            System.out.println("Enter number of icecreams sold:");
            double sold = sc.nextDouble();
            sc.nextLine();

            icecream[i] = new IceCream(name, sold);
        }

        System.out.println("\n--- Before Sorting ---");
        for (IceCream i : icecream) {
            System.out.println(i.getName() + " | " + i.getSold());
        }

        BubbleSort.bubblesortbysold(icecream);

        System.out.println("\n--- After Sorting (By Sold) ---");
        for (IceCream i : icecream) {
            System.out.println(i.getName() + " | " + i.getSold());
        }

        sc.close();
    }
}
