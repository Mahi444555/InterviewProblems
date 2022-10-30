/*program for print the following pattern using while loop in java...
 A B C D		in these pattern i am printing N liens hence i<=n and also columns printing till N hence J<=n...
 A B C D 			N=4
 A B C D		only printing character in or printing columns...i.e. j
 A B C D*/

import java.util.Scanner;
public class CharacterPattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	//where Scanner=Datatype sc=variable and taking new varible frm System.
		int n=sc.nextInt();
		
		int i=1;
		
		while(i<=n)		//for printing lines....1<=4, 2<=4, 3<=4, 4<=4, 5<=4 false then stop
		{
			int j=1;
			while(j<=n)		//for printing columns in that character
			{
				System.out.print((char)(j+64));	//j=1 then j+64= 1+64=65 and type casting in char 65=A
				j++;
			}
			System.out.println();
			i++;
		}
	
	}

}

