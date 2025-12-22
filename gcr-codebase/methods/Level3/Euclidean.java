import java.util.*;
public class Euclidean{

	public double findDistance(int x1, int y1, int x2, int y2){
		double a = x2 - x1;
		double b = y2 - y1;
		double distance;
		a = Math.pow(a,2);
		b = Math.pow(b,2);
		distance = Math.sqrt(a) + Math.sqrt(b);
	return distance; 
	}
	public double[] findLineEquation(int x1, int y1, int x2, int y2 ){
		double m = (y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		return new double[] { m , b};
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		Euclidean e = new Euclidean();
		System.out.println("distance between two points is : " + e.findDistance(x1,y1,x2,y2));
		double[] line = e.findLineEquation(x1, y1, x2, y2);
		System.out.println("m slope is : " + line[0]);
		System.out.println("y-intercept is : " + line[1]);
		System.out.println("Equation of line is : " + line[0] + " * x + " + line[1]);
	}
}