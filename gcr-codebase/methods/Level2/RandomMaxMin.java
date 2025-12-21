import java.util.Arrays;
public class RandomMaxMin {

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // create a method to find average, minimum and maximum
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num:numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum/numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
	// create obj and call the methods
        RandomMaxMin r = new RandomMaxMin();
        int[] random = r.generate4DigitRandomArray(5);
        double[] result = r.findAverageMinMax(random);
	
	// display the output
        System.out.println("Random Numbers:" + Arrays.toString(random));
        System.out.println("Average Value: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Maximum Value: " + result[2]);
    }
}
