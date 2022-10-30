/*Print the following pattern using while loop in java-language
 N=4
 ****
 ***
 **
 *
 These pattern looks like decreasing pattern or decreasing order hence directly take i=n and then i-- till i>=1
 */
import java.util.Scanner;
public class invertedTrianglePattern3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();				//taking n's value from System using Scanner variable sc
		int i=n;						//here directly assign n's value to i because is decreasing pattern
		
		while(i>=1)   //if n=4   4>=1-4th line printed 3>=1-3rd line then 2>=1   then 1>=1    then 0>=1 flase 
		{
			int j=1;
			while(j<=i)				//1st line 1<=4 then 4stars ll be printed 
			{
				System.out.print("*");
				j++;
				
			}System.out.println();
			i--;
		}

	}

}
