/*
 program for print following pattern...
 1
 2 3
 3 4 5 
 4 5 6 7
 */

package MyAssingment2;
import java.util.Scanner;
public class Pattern1Hw {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int val=1;
		while(i<=n)		//i=lines...
		{
			int j=1;
			while(j<=i)		//where i'm increasing my j till line numbers i.e. i/row...
			{
				System.out.print(val);
				//val=val+1;
				j++;
			}
			val=val+1;
			System.out.println();		//here printing new line...
			i++;
		}
	}

}
