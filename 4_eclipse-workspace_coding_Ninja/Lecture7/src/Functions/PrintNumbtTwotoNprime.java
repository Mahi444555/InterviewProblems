//program to print all prime number between 2 to n using function in java
package Functions;
import java.util.Scanner;
public class PrintNumbtTwotoNprime {

	public static void isprime(int N) {
		int i,newno;		//where i=iterations till new no and we divide newno%i and newno is number between seris
		
		for(newno=2;newno<=N-1;newno++) {		//newno increase till N and we cecking each no is prime or not
			{
				for(i=2;i<=newno-1;i++) {  //wehre i start 2 and less than newno 
					
					if(newno%i==0)
					{
						System.out.println(newno+"\t"+  "not prime");
						break;
					}
				}
				if(i==newno)
					System.out.println(newno+ "\t"+   "yes its prime");
			}	
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
				isprime(x);		//here im calling function
		
		
	}

}
