/*program for print following pattern using while loop in java...
        1
      2 3 
    4 5 6           here we have to also print spaces...
 7 8 9 10
 */
package Patterns;
import java.util.Scanner;
public class Patten3 {
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();			//taking n's value form System...
	int i=1;
	int val= 1;
	
	while(i<=n)					//lines
	{
		int k=1;
		while(k<=n-i)				//spaces...
		{
			System.out.print(" ");	
			k++;
		}
	
		int j=1;
		while(j<=i)
		{
			System.out.print(val);
			val++;
			j++;
		}
		System.out.println();		//new line 
		i++;
		}
	}
}

