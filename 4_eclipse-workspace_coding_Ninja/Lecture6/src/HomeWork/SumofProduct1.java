package HomeWork;
import java.util.Scanner;
public class SumofProduct1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();			//N taking n's value from System
		int c=sc.nextInt();			//choice taking c from user
		int i,sum=0,fact=1;
		
  if(c==1)
	 {		//choice is 1 then find sum of number...
			for(i=1;i<=N;i++)
		{
				sum=sum+i;		//sum=0+1=1 1+2=3 then 3+3=6
		}
		System.out.println(sum);
	
	}
	
  else if(c==2) 
	{				//choice is 2 then find product of number
		for(i=1;i<=N;i++)
		{
			
			fact=fact*i;		//1=1*1=1
		}
		System.out.println(fact);
	}
	
	else 
	{
		System.out.println("-1");
	}
		
  }
	
}