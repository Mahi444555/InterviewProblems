/* Print the following pattern in java uisng while-loop
 N=4
       1
     1 2 1
   1 2 3 2 1
 1 2 3 4 3 2 1
 here printing j columns but 1stly lines, then spaces, then numbers or j's value then 2nd half pattern 
 */
import java.util.Scanner;
public class IsocelsTriangle6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)		//printing liens till N
		{
			int k=1;		//spaces
			while(k<=n-i)		//1<=n-i i.e. total-line number if n=4 then 4-1 =3 spaces on 1st line
			{
				System.out.print(" ");
				k++;
			}
			
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			
			j=2;			//theses is 2nd half pattern from 2nd columnd j=2 1st column we skipped
			int val=i-1;	//where val=i-1 if line 2  then 2-1=1 then val=1 and print that and decrease that val--
			while(j<=i)		//directly start from 2nd column hence 1st line flase 2<=1 hecne no print
			{
				System.out.print(val);
				val--;
				j++;
			}
			
			
			
			System.out.println();
			i++;
		}
	}

}
