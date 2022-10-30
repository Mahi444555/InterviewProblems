import java.util.Scanner;
public class capgiminiPrimeComposite {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	//declaring Scanner object sc 
		int T=sc.nextInt();
		int q=1;
		while(q<=T)	//test-cases to be run
		{
			int i;
			int n=sc.nextInt();//taking n's value
			//int arr[]=new int[n];	//My array and size passing n
			for( i=2;i<=n-1;i++)	//prime is divisible by only 1 and itself except that from 2 to n-1
			{
				if(n%i==0)
				{
					System.out.println("composite number");
					break;
				}
			}
			if(i==n)
			{
				System.out.print("prime");
			}
			q++;
		}
	}

}
