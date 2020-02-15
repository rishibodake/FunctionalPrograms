package functionalPrograms;
import java.util.*;
public class Distance {
	public static void main(String[] args) {
		Distance.check();
		
	}
	
	public static void check()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of 'x'");
		int x = in.nextInt();
		
		System.out.println("Enter the value of 'y");
		int y = in.nextInt();
		
		double sum = x*x + y*y;
		double distance = Math.sqrt(sum);
		
		System.out.println("Eucliers distance is: "+distance);
	}
}
