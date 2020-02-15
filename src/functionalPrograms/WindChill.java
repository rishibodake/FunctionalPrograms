package functionalPrograms;
import java.util.*;
public class WindChill {

	public static void main(String[] args) {
		WindChill.check();
		
	}
	
	public static void check()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temprature in fernheight: ");
		double temp = in.nextDouble();
		
		System.out.print("Enter the velocity of wind in miles: ");
		double vel = in.nextDouble();
		
		if(temp < 150.0 && vel < 150 && vel > 3)
		{
			double w = (35.74 + 0.6215*temp) +(0.4275*temp -35.75)*Math.pow(vel, 0.16);
			System.out.println("Wind Chill is: "+w);
		}
		else
		{
			System.out.println("formula is not valid for these data");
		}
		
		
		
	}

}
