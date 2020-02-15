package functionalPrograms;
import java.util.*;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = in.nextInt();
		
		int[] a = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i] = in.nextInt();
		}
		
		boolean flag = false;
		
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<size;j++)
			{
				for(int k=0;k<size;k++)
				{
					if(a[i]+a[j]+a[k] == 0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						break;
					}
					else
					{
						flag = true;
					}
				}
			}
		}
		
		if(flag == true)
		{
			System.out.println("No such elements present in an array");
		}
		
		
	}

}
