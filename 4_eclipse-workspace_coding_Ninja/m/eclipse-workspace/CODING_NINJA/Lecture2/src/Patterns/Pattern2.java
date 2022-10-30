/*Pattern for print pattern using while loop...
 1
 2 3
 4 5 6
 7 8 9 10
 */
package Patterns;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();				//accepting n's value from System...
		int i=1;
		int val=1;			//these val is number that we increasing continuously in j loop...
	
		while(i<=n)		//for lines printing...
		{
			int j=1;
			while(j<=i)		//i'm increasing my columns till line number i.e. i and in that  printing val values..
			{
				System.out.print(val);
				val=val+1;					//increasing inner value ie. val continously till my loop get flase.. 
				j++;
			}
			System.out.println();		//for printing new line...
			i++;     					//increasing i's value 
			
		}
		
	}

}
