//program for print all number form 1 to N using while loop in java....

package while_loop;
import java.util.Scanner;
public class print1ToN {
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)				//i is always less than equal to n i.e. if n=5 then it will iterate till n only..
		{
			System.out.println(i);
			i++;
		}
		
	}
}
