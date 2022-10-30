//Program for the print the following pattern using while loop in 
/* 
      *		in these pattern 1st print lines then print spaces then print in j's loop/columns Stars *
    * *			1st line= only 1 star, 2nd line = 2star , 3rd line=3star which i.e. print start till less than
  * * *				equal to line number i.e. j<=i
* * * *
 */
import java.util.Scanner;		//header file for Scanner datatype importing...
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();		//taking n's value using Scanner variable sc
		int i=1;
		while(i<=N)	//printing lines till N hence i<=n
		{
			int k=1;		// k= print space	if n=4
			while(k<=N-i)  //for 1st line- 1<=4-1 i.e. 1<=3 then on 1st lien three spaces will printed
			{
				System.out.print(" ");	//spaces i.e. total- line number N-i
				k++;
			}
			int j=1;		//printing Stars here in j's loop in column
			while(j<=i)			// it will iterate only till line number
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
