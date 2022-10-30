/*print the following pattern 
 5 4 3 2 *
 5 4 3 * 1
 5 4 * 2 1
 5 * 3 2 1
 * 4 3 2 1
 IN THESE PATTERN WE JUST PRINTING J'S VALUE IN DECREASING ORDER & EAACH LINE TILL RUNS TILL N  i.e. j=n;j>=1;j--;
 
 */
import java.util.Scanner;		//my header files
public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
			
		for(i=1;i<=n;i++)		//i is line/rows which iterates/increase till n
		{
			for(j=n;j>=1;j--)	//here in column prining columns in descending hence directly assign n's value to j
			{
				if(j==i)		//if both are same i&j then print * else print j
					System.out.print("*"+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();		//new lines
		}
	}

}
