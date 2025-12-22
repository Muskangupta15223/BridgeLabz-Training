import java.util.*;
//create a class SpringSeasonOrNot to find season is spring or not 
public class  SpringSeasonOrNot{
	public static void main(String args[]){
		// taking date and month as input from user using command line
		int month = Integer.parseInt(args[0]);
 		int day = Integer.parseInt(args[1]);

                 if ((month == 3 && date >= 20 && date <= 31 ) || (month == 4 && date >= 1 && date <= 30) ||
                     (month == 5 && date >= 1 && date <= 31) || (month == 6 && date >= 1 && date <= 20)){
			System.out.println(" Spring Season ");
		}else{
			System.out.println("Not a Spring Season");

		}
	}
}