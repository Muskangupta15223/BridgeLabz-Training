import java.util.*;
public class SpringSeason{
	// create method isSpring for finding season is spring or not
	public String isSpring(int date , int month ){
		if(month >= 3 && month <= 6){	
		      if((month == 3 && date >= 20 && date <= 31) ||
			(month == 4 && date >= 1 && date <= 30) || 
			(month == 5 && date >= 1 && date <= 31) ||
			(month == 6 && date >= 1 && date <= 20 )){
			return "Its a Spring Season";
			}
		}
		return "Its not a Spring Season";
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		
		// create object and call method isSpring
		SpringSeason ss = new SpringSeason();
		System.out.println(ss.isSpring(date,month));
	}
}