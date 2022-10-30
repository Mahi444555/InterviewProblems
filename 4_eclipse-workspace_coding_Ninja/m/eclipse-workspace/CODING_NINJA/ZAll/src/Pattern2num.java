/*program for print the following pattern..using while loop...
1
2 3 			//these pattern is we are taking new variables i.e. val  and these continuously increasing 
4 5 6 				in j's loop...till outer loop condition get false...
7 8 9 10 

*/
import java.util.Scanner;		//header files...
public class Pattern2num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int val=1;
		
		while(i<=n)			//i=lines/rows will be printed..
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(val);	//where val is contineouly increasing in j's loop...
				val++;
				j++;
			}
			System.out.println();  	// for print new line...
			i++;
		}
			
	}			
			
}


