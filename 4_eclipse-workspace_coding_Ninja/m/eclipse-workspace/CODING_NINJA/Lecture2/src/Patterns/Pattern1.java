/*program for print following patterns..
 1
 12					if n=5
 123
 1234
 12345 */

package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)		//for printing liens till n...
		{
			int j=1;
			while(j<=i)		//printing columns and in that printing numbers till row number/line numbers...
			{	
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
