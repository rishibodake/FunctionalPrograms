package functionalPrograms;
import java.util.*;
public class Quadratic {
	public static void main(String[] args) {
		Quadratic.check();
	}
	
	public static void check()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the root 'a'");
		double a = in.nextDouble();
		
		System.out.println("Enter the root 'b'");
		double b = in.nextDouble();
		
		System.out.println("Enter the root 'c'");
		double c = in.nextDouble();
		
		double delta = b*b - 4*a*c;
		if(delta < 0)
		{
			System.out.println("as delta is less than zero roots are not possible");
		}
		else if(delta > 0)
		{
			double root1 = (-b+Math.sqrt(delta)/2*a);
			double root2 = (-b-Math.sqrt(delta)/2*a);
			System.out.println("Root 1 of x is: "+root1);
			System.out.println("Root 2 of x is: "+root2);
		}
		else
		{
			double root1 = -b/2*a;
			System.out.println("Root 1 of x is: "+root1);
		}
	}

}
