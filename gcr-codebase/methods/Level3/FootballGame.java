import java.util.*;
public class FootballGame{

    public static final int TOTAL_PLAYERS = 11;
    public static final int MIN_HEIGHT = 150;
    public static final int MAX_HEIGHT = 250;

    public static int[] generatePlayerHeights() {
        int[] heights = new int[TOTAL_PLAYERS];

        for (int index = 0; index < heights.length; index++) {
            heights[index] = (int) (Math.random() * (MAX_HEIGHT - MIN_HEIGHT + 1)) + MIN_HEIGHT;
        }
        return heights;
    }

    // Calculate sum of heights
    public static int calculateTotalHeight(int[] heights) {
        int totalHeight = 0;

        for (int height : heights) {
            totalHeight += height;
        }
        return totalHeight;
    }

    // Calculate mean height
    public static double calculateMeanHeight(int[] heights) {
        int totalHeight = calculateTotalHeight(heights);
        return (double) totalHeight / heights.length;
    }

    // Find shortest height
    public static int findShortestHeight(int[] heights) {
        int shortestHeight = Integer.MAX_VALUE;

        for (int height : heights) {
            if (height < shortestHeight) {
                shortestHeight = height;
            }
        }
        return shortestHeight;
    }

    // Find tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = Integer.MIN_VALUE;

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    // Display heights
    public static void displayHeights(int[] heights) {
        System.out.println("Player Heights (cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] playerHeights = generatePlayerHeights();
        displayHeights(playerHeights);
        int shortestHeight = findShortestHeight(playerHeights);
        int tallestHeight = findTallestHeight(playerHeights);
        double meanHeight = calculateMeanHeight(playerHeights);

        System.out.println("\nShortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height : " + tallestHeight + " cm");
        System.out.println("Mean Height    : " + Math.round(meanHeight * 100.0) / 100.0 + " cm");
    }
}