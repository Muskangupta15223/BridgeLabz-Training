import java.util.*;
//Creating Class with name KmToMilesInput for converting kilometers to miles using user input.
class KmToMilesInput {
    public static void main(String[] args) {
        // Taking kilometres as input from user
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();

        // Converting kilometres to miles
        double miles = kilometers / 1.6;

        // Displaying the converted distance
        System.out.println("The total miles is "+ miles + " mile for the given " + km + " km");
        input.close();
    }
}