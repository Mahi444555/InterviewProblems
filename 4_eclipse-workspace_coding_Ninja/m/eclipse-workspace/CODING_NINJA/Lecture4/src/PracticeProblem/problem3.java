/* print the following pattern uisng while loop in java
 A B C D
 A B C
 A B 
 A
 */
package PracticeProblem;
import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int i=N;			//here assigning N directly to i decreasing order 5 4 3 2 1

		while(i>=1)			//5>=1 true then 5th line will be print then 4 3 2 1 then stop
		{
			int j=1;
				
			while(j<=i)		//1<=5 
			{
				System.out.print((char)(j+64));		//typecasting in integer=character 1+64 = 65 is A 
				j++;
			}
			System.out.println();
			i--;
		}
		
	}

}
