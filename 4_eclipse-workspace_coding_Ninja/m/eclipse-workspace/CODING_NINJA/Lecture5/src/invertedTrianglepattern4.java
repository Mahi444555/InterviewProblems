/*print the following pattern using while loop in java
 N=4
 * * * *			on 1st line printing from 1st position
   * * *			on 2nd line printing from 2nd position 
     * *			on 3rd line printing from 3rd position which means ith postion or from line number
       *
 In these above pattern we have to print lines i, spaces k, then stars in j's loop but here we can't take 
 directly i=n because here we have also print spaces hence i=1 
 */

import java.util.Scanner;
public class invertedTrianglepattern4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)		//printing n lies i= lines/row number
		{
			int k=1;
			while(k<i)	//1<1 flase then 1st line 0 spaces 1<2 2nd line 1space same again an again 
			{
				System.out.print(" ");
				k++;
			}
			
			int j=i;		//j=i which means printing stars from i'th location or from line number to till N
			while(j<=n)					//1<=4 then 1st line 4 stars
			{
				System.out.print("*"); 
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
