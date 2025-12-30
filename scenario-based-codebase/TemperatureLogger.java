import java.util.*;

class TemperatureLogger {

    public static double[] findAverageAndMax(double[] tempRecord) {
        double sum = 0;
        double max = tempRecord[0];
        for (double temp : tempRecord) {
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }
        return new double[] { sum / tempRecord.length, max };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tempRecord = new double[7];
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < tempRecord.length; i++) {
            System.out.print("Enter the temperature for " + days[i] + ": ");
            tempRecord[i] = sc.nextDouble();
        }
        double[] results = findAverageAndMax(tempRecord);
        System.out.printf("Average Temperature: %.2f\n", results[0]);
        System.out.printf("Maximum Temperature: %.2f\n", results[1]);
        sc.close();
    }

}