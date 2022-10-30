package HomeWork;
import java.util.Scanner; 
public class DecimalToBinary5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long rem,sum=0,mul=1;
		
		while(n>0)
		{
			rem=n%2;		//when any no to binary then divide by 2 
			sum=sum+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(sum);
	}

}
