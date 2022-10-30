/*program for print following pattern using while loop in java
 if N=4		here we are printing lines and iterating i till N and also j iterating till N...
* * * * 
* * * *
* * * *
* * * *
*/
import java.util.Scanner;	//these is header file for Scanning funcitons...
public class Pattern1 	//these is class_name...
	{
	public static void main(String[] args)	//these is my main functions...
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		 int i=1;
		while(i<=N)		//printing lines/rows
		{
			int j=1;
			while(j<=N)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	

}
