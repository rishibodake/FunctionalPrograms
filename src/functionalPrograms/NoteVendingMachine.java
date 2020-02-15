
package functionalPrograms;
import java.util.*;
public class NoteVendingMachine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the amount");
		int amt = in.nextInt();
		
		NoteVendingMachine.check(amt);
		
	}
	
	public static int check(int amt)
	{
		int[] notes = {2000,500,200,100,50,20,10,5,2,1};
		//int i = 0;
		for(int i=0;i<notes.length;i++)
		{
			if(amt-notes[i] > 0)
			{
				
				amt = amt - notes[i];
				System.out.println(notes[i]);
			}
			else
			{
				continue;
			}
			
				
		}
		return check(amt);
	}

}
