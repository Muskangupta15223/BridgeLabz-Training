package com.geomeasure;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineComparisonApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> comparisons = new ArrayList<>();

        System.out.print("Enter number of comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
            Line line1 = new Line(sc.nextInt(), sc.nextInt(),
            		sc.nextInt(), sc.nextInt());

            System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
            Line line2 = new Line(sc.nextInt(), sc.nextInt(),
            		sc.nextInt(), sc.nextInt());
            double len1 = line1.calculateLength();
            double len2 = line2.calculateLength();

            String result;
            if (len1 == len2) {
                result = "Both lines are equal in length.";
            } else if (len1 > len2) {
                result = "Line 1 is longer than Line 2.";
            } else {
                result = "Line 2 is longer than Line 1.";
            }

            System.out.println(result);
            comparisons.add(result);
        }

        System.out.println("\nStored Comparisons:");
        for (String res : comparisons) {
            System.out.println(res);
        }

        sc.close();
    }
}

