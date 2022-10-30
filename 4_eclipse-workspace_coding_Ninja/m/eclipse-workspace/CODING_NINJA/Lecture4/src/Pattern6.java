/*print the following pattern
 1
 2 3			//in these pattern we are start our line form line/row number and then increase 
 3 4 5
 4 5 6 7*/

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		int k;
		
		while(i<=n)		// where i=print lines..
		{
			int j=1;
				k=i;
				
				while(j<=i)		//j=print columns in that print numbers which start form line num hence k=i..
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
