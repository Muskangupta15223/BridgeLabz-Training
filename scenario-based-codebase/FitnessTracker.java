import java.util.*;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pushUpsRecord = new int[7];
        int total = 0, average = 0;
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < pushUpsRecord.length; i++) {
            if (days[i].equals("Saturday") || days[i].equals("Sunday")) {
                System.out.println("Want Rest day or not on ?" + days[i] + " (yes/no): ");
                String response = sc.nextLine();
                if ((response.equalsIgnoreCase("yes"))) {
                    System.out.print("Rest day!!!!!!!!!! No push-ups");
                    pushUpsRecord[i] = 0;
                    continue;
                }
            }
            System.out.print("Enter the number of push-ups for " + days[i] + ": ");
            pushUpsRecord[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i : pushUpsRecord) {
            total += i;
            average = total / pushUpsRecord.length;

        }
        System.out.println("Total Push-ups: " + total);
        System.out.println("Average Push-ups: " + average);
        sc.close();
    }

}
