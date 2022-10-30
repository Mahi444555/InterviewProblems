package Break_Continue_Keyword;
import java.util.Scanner;
public class Break_KeywordPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		
		for(i=2;i<=n-1;i++)		//to check prime number divide that number from 2 to less than that number n-1
		{
			if(n%i==0)
			{
				System.out.print("Not prime");
				
				break;
			}
		}
		
		if(i==n)
			System.out.print("prime");
	}
	
}
