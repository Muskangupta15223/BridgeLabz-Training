import java.util.*;
//Creating Class with name MaximumNumberOfHandshakes for calculating maximum number of handshakes
class MaximumNumberOfHandshakes{
    public static void main(String args[]){
        // Taking numberOfStudents as input from user
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        // Calculating maximum handshakes
        int maxHandShake = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying number of possible handshakes
        System.out.println("Number of possible handshakes are " + maxHandShake);
    }
}