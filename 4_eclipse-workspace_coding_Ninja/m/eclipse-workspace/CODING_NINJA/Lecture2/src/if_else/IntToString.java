//program for print one or two or three else invalid...

package if_else;

import java.util.Scanner;		//header files for Scanner 

public class IntToString {

	public static void main(String[] args) 	//These is my main() function...
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();	//taking n's value from user...
		if(n==1)
			System.out.println("One");
		else if(n==2)
			System.out.println("Two");
		else if(n==3)
			System.out.println("Three");
		else 
			System.out.println("invalid input");
		
	}

}
