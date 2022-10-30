import java.util.Scanner;
public class sumORproduct1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();			//taking number 
		int c=sc.nextInt();		//these c=choice asking to user
		int i,sum=0,fact=1;
		
		if(c==1)
		{
			for(i=1;i<=N;i++)
			{
				sum=sum+i;		//if user entered 1 as choice then print sum of numbers till that number 1+2+3...N
			}
			System.out.println(sum);
		}	
			else if(c==2)		//if user choie is 2 then print factorial/product of that number
			{
				for(i=1;i<=N;i++)
				{
					fact=fact*i;
				}
				System.out.println(fact);
			}
	
			else
				System.out.println("-1");
		
	}

}
