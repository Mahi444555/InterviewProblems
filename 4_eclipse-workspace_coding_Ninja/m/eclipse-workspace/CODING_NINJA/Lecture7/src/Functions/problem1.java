package Functions;
//program on permutaion & combination n c r where n=number of object c=combination r=no of object selecting at a time
//n!/r!(n-r)!
import java.util.Scanner;
public class problem1 {
	
	public static int factorial(int n) {
		//System.out.println(n);
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		System.out.println(ans);
		return ans;
		
	}
	
	public static int isprime(int n) {
		int i;
		for(i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				break;
			}
		}
		if(i==n)
			System.out.println("prime");
		return i;
	}
	
	public static int allnum( int n) {
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println(i+"\t");
			
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();		//r=no of object selecting at a time
		
		int num=factorial(n);
		
		int den1=factorial(r);
		
		int den2=factorial(n-r);
		
		int ans=num/(den1 * den2);
		System.out.println(ans);
	
	
		
		int p=isprime(n);
		
		int c=allnum(n);
	}

}
