/*
 5432*
 543*1  here im printing j's value but in decending order hence i=1;i<=n;i++ but j=n;j>=1;j-- and print j
 54*21
 5*321
 *4321
 */

import java.util.Scanner;
public class printPattern {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++)		//printing n number of lines i
		
		{
			for(j=n;j>=1;j--)
			  if(i==j)
				System.out.print("*");
			
			 else	
			  {
				System.out.print(j);
			  }
			System.out.println();
		}
		
	}

}
