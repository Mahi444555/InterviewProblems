/*print following pattern..using while loop in java...
 n=4
 
1234
1234				here just printing j i.e. column number...till n
1234
1234

 */
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)		//i=lines/row number print
		{
			int j=1;
			while(j<=n)		//j=columns in that printing numbers 
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
