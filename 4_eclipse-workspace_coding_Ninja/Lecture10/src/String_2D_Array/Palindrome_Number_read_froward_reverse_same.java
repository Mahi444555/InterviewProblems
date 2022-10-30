package String_2D_Array;
import java.util.Scanner;
public class Palindrome_Number_read_froward_reverse_same {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rem,rev=0,temp,sum=0;		//declaring temporary variable to store original, rev=reverse,and sum
		int n=sc.nextInt();	//taking n's value from System
		temp=n;	//storing original value into temp for comparing it's same or not
		while(n>0)
		{
			rem=n%10;	//gives remainder or last number111%10=1; 11%10=1; 1%10=1
			rev=(rev*10)+rem;	//eg: 111  then 111%10=1 then 0*10+1=1; 1*10+1=11; 110+1=111
			n=n/10;
		}
		if(temp==rev)
			System.out.println("yes its palindrome");
		else
			System.out.println("not a pallindrome");
	}

}
