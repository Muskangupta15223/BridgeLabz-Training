import java.util.*;
public class Quadratic{
	// create a method to find roots of quadratic equation
	public double[] findRoot(double a, double b, double c, double d){
		double[] root = new double[2];
		if(d > 0){
			root[0] = (-b + Math.sqrt(d)) / (2 * a); 
			root[1] = (-b - Math.sqrt(d)) / (2 * a); 
		}else if( d == 0){
			root[0] = -b / ( 2 * a);
		}
		return root;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//create object and call methods
		Quadratic q = new Quadratic();
		double delta = Math.pow(b,2) - 4 * a *c;
		System.out.println(Arrays.toString(q.findRoot(a,b,c,delta)));
	}
}