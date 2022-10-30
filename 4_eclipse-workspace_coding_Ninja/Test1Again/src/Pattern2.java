/*program for print the following patterns
 if n=4
here print 1st		* 0 0 0  *  0 0 0 *		then print middle column i.e. only for stars which is 5th column
half i.e			0 * 0 0  *  0 0 * 0		and then 2nd half j-- now j's value is 5 then on all 5th  column we print
i<=4				0 0 * 0  *  0 * 0 0		only stars and then j become 4 thne j>=1 till 1 j-- and print stars only
					0 0 0 *  *  * 0 0 0			for j==i;
 
 */
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		
		//for 1st half 
		for(i=1;i<=n;i++)		//lines i=1 n=4      then 1<=4 four lines will be printed 
		{
					for(j=1;j<=n;j++)	//columns 1<=4 2<=4  3<=4 4<=4 THEN 5<=4 when j become 5 it condition fails
					{
						if(i==j)
							//System.out.print(i+""+j+" ");
							System.out.print("*"+" ");	//	(i,j)(1,1) (2,2)  (3,3)  (4,4) these location print stars
						else
							System.out.print(i+""+j+" ");
							//System.out.print("0"+" ");
					}
					
	//form these 2nd half printing on each lines and now j's vlaue =5 and each 5th column print * i.e. middile
					
					j--;
					
					//System.out.print(i+""+j+" ");
					System.out.print("*"+" "); 		//on each 5th column we printing * i.e. middle column
					while(j>=1)			//using while loop 4>=1 3>=1 2>=1 1>=1 (0>=1 false)
					{
						if(j==i)			//comparing with liens if i and j same print * else  0
							//System.out.print(i+""+j+" ");
							System.out.print("*"+" ");
						else
							System.out.print(i+""+j+" ");
							//System.out.print("0"+" ");
						j--;		//4-1=3   3-1=2   2-1=1 1-1=0
					}
					
			System.out.println();
			
		}
	}

}
