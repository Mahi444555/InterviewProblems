/*
 program for print following pattern...
 1
 2 3		//in these pattern i am starting each line form line num/row num hence make new variable i.e. k=i
 3 4 5				//here i have to take new variable and assign i's value to it and increase continouly..
 4 5 6 7
 */
import java.util.Scanner;
public class numberPatternHw1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();					//taking n's value from user...
		int i=1;
		while(i<=n)		//lines 1<=5=true then 1st line to 5th line will be printed...
		{
			int k=i;		//here i am assign k=  to line number/row 
			int j=1;
			while(j<=i)
			{
				System.out.print(k);
				k++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
