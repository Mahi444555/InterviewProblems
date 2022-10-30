package while_loop;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	/*where Scanner=datatype, sc=declaring variable to Scanner 
		 									which accepting all value from System. & new Scanner=is a funcn that
		 									tells scan/take values from System hecne (System.in)*/
		int n=sc.nextInt();		//taking from user n's value...
		int i=2;
		while(i<=n-1)
		{
			if(n%i==0)
			{
				System.out.println("Not prime");
				break;					//if its not prime then don't check for other number and exit form loop...
			}
			
			i++;	
		}
		
		if(i==n)
		{
			System.out.println("prime");
		}
	}

}
