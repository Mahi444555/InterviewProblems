import java.util.Scanner;
public class mindtreeLuckyno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem,sum=0;
		int i=1;
		int i2=1;
		while(n>0 && i<=2) 
		{
			rem=n%10;
			//System.out.print(rem);
			sum=sum+rem;
			n=n/10;
			i++;
		}
		System.out.println(sum);
		
		int j=n;
		System.out.println(j);
		int sum2=0;
		while(j>0 && i2<=2) {
			
			rem=n%10;
			sum2=sum2+rem;
			n=n/10;
			i2++;
		}
		System.out.println(sum2);
	
	if(sum==sum2)
	{
		System.out.print("yes its lucky number");
	}
	else
		System.out.print("No");
  }
}
