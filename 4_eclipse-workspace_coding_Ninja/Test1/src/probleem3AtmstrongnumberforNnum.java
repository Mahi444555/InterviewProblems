import java.util.Scanner;
public class probleem3AtmstrongnumberforNnum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=n;			//assigning n's value to t1 i.e.storing in temp
		int length=0;		//these for counting how much length of number i.e.
		while(t1>0)
		{
			length++;
			t1=t1/10;		//these gives me how much length of number eg 123 then 3digite numer 1234 =4digite no
		}
		
		int t2=n;		//here assigning original value n to t2
		int sum=0;
		while(t2>0)
		{
			int mul=1;
			
			int rem=t2%10;		//gives remainder 153%10=3 then 5 then 1
			
			for(int i=1;i<=length;i++)		//i iterate/increase till length of number
			{	
				mul=mul*rem;
			}
			sum=sum+mul;
			t2=t2/10;		//gives quoetient part /first part 
		}
		
		if(sum==n)
		{
			System.out.println("Armstrong number");	
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}

}