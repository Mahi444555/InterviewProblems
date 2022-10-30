/*program for print following pattern...
    *
   ***
  *****  here are two patterns 1st half and 2nd half then 
 *******
 
 
 */
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int k;
		while(i<=n)
		{
		 k=1;
			while(k<=n-i)			//these loop is for print spaces...
			{
				System.out.print(" ");
				k++;
			}
			int j=1;
			while(j<=i)						//these loop for 1st half of pyramid
			{
				System.out.print("*");
				j++;
			}
			j=2;		
			while(j<=i)						//these while loop for 2nd half of pyramid
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
