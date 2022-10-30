package if_else;
import java.util.Scanner;
public class FindPowerOfNum {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int x=sc.nextInt();
	        int n=sc.nextInt();			//taking two numbers i.e. x&n form System
	        int mul=1;
	        int i=1;
	        
	        while(i<=n)	//here i'm increasing my i till n and then multiply that num.
	        {
	         	mul=mul*x;	//1*x i.e. if x=2 then x*2 
	            
	            i++;
	        }
	        System.out.print(mul);
	}

}
