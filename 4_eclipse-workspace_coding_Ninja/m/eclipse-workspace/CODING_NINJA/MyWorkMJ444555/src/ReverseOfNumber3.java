//program for the find reverse of number
import java.util.Scanner;
public class ReverseOfNumber3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int rem,rev=0;
		
		while(N>0)	//my N is always greater than zero we dividing till 0 
		{
			rem=N%10; 		//% gives remainder
			rev=(rev*10)+rem;
			N=N/10;		// / division gives first digite or quoetient part only
		}
		System.out.println(rev);
	}
}
