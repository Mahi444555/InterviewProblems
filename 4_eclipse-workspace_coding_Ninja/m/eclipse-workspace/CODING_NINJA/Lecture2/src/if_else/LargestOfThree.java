package if_else;
import java.util.Scanner;			//header file for scanner
public class LargestOfThree {
	
	public static void main(String[] args)		//my main() Function...
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		//i'm taking input three numbers form user... using sc variable i.e. scanner...
		
		if((a>=b) && (a>=c))
		{
			System.out.println("a is greater");
		}
		else if((b>=a) && (b>=c))		//checking for b is greater or not...
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater than both");
		}
		
	}

}
