import java.util.*;

class Attendance {

    public static void main(String[] args) {
        System.out.println("Attendance system initialized.");
        Scanner sc = new Scanner(System.in);
        String[] student = new String[10];
        int pCount = 0;
        int aCount = 0;
        System.out.println("Give names of students");
        for (int i = 0; i < student.length; i++) {
            student[i] = sc.nextLine();
        }
        for (String name : student) {
            System.out.print("Is " + name + " present? (P/ A):  \t  ");
            char ans = sc.next().charAt(0);
            if (ans == 'P' || ans == 'p') {
                pCount++;
            } else if (ans == 'A' || ans == 'a') {
                aCount++;
            }
        }
        System.out.println("Total Present student is : " + pCount);
        System.out.println("Total Absent student is : " + aCount);
    }
}
