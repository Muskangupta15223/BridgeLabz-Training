import java.util.Scanner;
public class ReverseOrder{
    public static void main(String[] args) {
		// Take num as input and rev declare as  array
		Scanner sc = new Scanner(System.in);
 		int temp = number;
		int count = 0;

		//Count number of digits
		while (temp > 0) {
		count++;
 		temp = temp / 10;
		}

		// Create array to store digits
		int[] digits = new int[count];
        	temp = number;
		int index = 0;

        	//Store digits in array
        	while (temp > 0) {
            		digits[index] = temp % 10;
            		temp = temp / 10;
            		index++;
        	}

         	//Create reverse array
        	int[] reverse = new int[count];

        	for (int i = 0; i < count; i++) {
            	reverse[i] = digits[i];
        	}

        	//Display reversed number
        	System.out.print("Reversed number is: ");
        	for (int i = 0; i < count; i++) {
            	System.out.print(reverse[i]);
        	}
	}
}

