package while_loop;
import java.util.Scanner;
public class SumOfEvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int sum=0;
		
		while(i<=n)
		{
			if(i%2==0)			//modulus gives= remainder as =0...
				sum=sum+i;
			i=i+2;
			
		}
		System.out.println(sum);
	}

}
