/*  1
   121        
  12321
 1234321
  12321
   121
    1
				   *
				  ***
				 *****
				*******
				 *****
				  ***
				   *

*/

import java.util.Scanner;
public class practiceProblem2 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)		//i=printing liens till N
			{
				int k=1;
				while(k<=n-i)		//n-line number	1<=4-1  =  1<=3 then 3 spaces on 1st line
				{
					System.out.print(" ");
					k++;
				}
				int j=1;
				while(j<=i)
				{
					//System.out.print(j);
					System.out.print("*");
					j++;					//till here 1st half 
				}
				j=2;
				//int val=i-1;			//2nd half start from line number and decreasing 
				while(j<=i)	//1st half pyramid in that 2nd half
				{
					//System.out.print(val);
					System.out.print("*");
					//val--;
					j++;
				}
				System.out.println();
				i++;
			}
		
		 i=n-1;		//n=4-1=3 i..e i=3 decreasing pattern skiiping one line/row
		while(i>=1)
		{
			int s=1;	//s=spaces		now i=3
			while(s<=n-i)		//1<=4-3=1 then 1<=1 only one space
			{
				System.out.print(" ");
				s++;
			}
		 int j=1;
		 while(j<=i)
		 {
			 //System.out.print(j);
			 System.out.print("*");
			 j++;
		 }
			j=2;
			//int jm=i-1;		//jm=2 now 
     		while(j<=i)		//2<=3 then it will iterate two times
     		{
     			//System.out.print(jm);	//2 then 1 decreasing 
     			System.out.print("*");
     			//jm--;
     			j++;
     		}
		 System.out.println();
		 i--;
		}
	}
}
