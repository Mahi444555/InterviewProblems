/*program for print the Character pattern using while loop in java
 A B C D																			1 A
 B C D E 			N=4																2 B
 C D E F		where we are printing each line start from line number i.e. i 		3 C
 D E F G 							and then increasing our i 						4 D
 */

import java.util.Scanner;
public class CharacterPattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();			//taking n's value from System using Scanner variable i.e. sc
		int i=1;
		
		while(i<=n)		//i=lines/row number
		{
			int j=1;
			int k=i;
			while(j<=n)		//j also iterate till N   1<=4, 2<=4, 3<=4, 4<=4 then 5<=4 false and stop
				
			{	System.out.print(k+64+" "+(char)(k+64)+" ");//System.out.print((char)(k+64));		//type casting integer to character
				k++; // increasing k's value +1 +1 +1 +1 then get false
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	}


