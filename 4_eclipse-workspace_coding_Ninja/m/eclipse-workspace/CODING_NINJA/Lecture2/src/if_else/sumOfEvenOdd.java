package if_else;
import java.util.Scanner;
public class sumOfEvenOdd {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
	        
	        int N=sc.nextInt();		//taking N as input...
	        
	        int evensum=0;
	        int oddsum=0;
	        int rem;
	        while(N>0)
	        {
	            rem=N%10;			/*if N=12 then separating these no remainder oprt
	        							where % modulus= last number or remainder 		*/
	            if(rem%2==0)		// here checking is remainder/last digite is even or not
	            {
	                evensum=evensum+rem;
	            }
	            else 
	            {
	                oddsum=oddsum+rem;
	            }
	            
	            N=N/10;				/*these gives me quoitient part only &again check 
	            						these is greater than 0 or not..*/
	        }
	        System.out.print(evensum+" "+oddsum);

	}

}
