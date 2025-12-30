import java.time.LocalDate;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class LibraryReminder {

    public static int fineCalculator(LocalDate dueDate, LocalDate returnDate) {
        long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
        int finePay = (int) daysLate * 5;
        return finePay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Library Reminder System");
        int numOfBooks = 5;
        while (numOfBooks-- > 0) {
        }
        System.out.println("Enter the date when the book was taken (YYYY-MM-DD): ");
        LocalDate takenDate = LocalDate.parse(sc.next());
        LocalDate dueDate = takenDate.plusDays(14);
        System.out.println("The return date of the book(YYYY-MM-DD):");
        LocalDate returnDate = LocalDate.parse(sc.next());

        if (returnDate.isAfter(dueDate)) {
            System.out.println("You have returned the book late.");
            int fine = fineCalculator(dueDate, returnDate);
            System.out.println("Fine to be paid: Rs " + fine);
        } else {
            System.out.println("You have returned the book on time. No fine.");
        }

    }

}
