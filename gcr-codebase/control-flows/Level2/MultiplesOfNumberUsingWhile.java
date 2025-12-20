import java.util.*; 
//Creating class MultiplesOfNumberUsingWhile to find multiple of number
public class MultiplesOfNumberUsingWhile{
	public static void main(String args[]){
		//Taking number as input form user
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//check positive and less than 100
		if(number > 0 && number < 100){
			// use while  loop backward and check multiple
			int i = 100;
			while (i >= 1) {
				if (i % number == 0) {
					System.out.println(i);
				}
			i--;
			}
 		}else{
            System.out.println("Invalid input.");
		}

	}
}


