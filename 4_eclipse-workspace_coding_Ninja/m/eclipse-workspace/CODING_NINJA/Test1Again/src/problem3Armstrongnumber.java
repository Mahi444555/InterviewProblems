import java.util.Scanner;
public class problem3Armstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=n;
		int length=0;
		
		while(t1>0)
		{
			length++;
			t1=t1/10;		//gives quotient part 153 then 3 digit number
		}
		int t2;
		t2=n;
		int sum=0;
		while(t2>0)
		{
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			t2=t2/10;		//gives first part again check is greater than 0 or not
		}
		if(sum==n)
			System.out.println("yes");
		else
			System.out.println("not");
		
	}

}
