/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius 
values and print the table.*/


package MyAssingment2;			//these is package name
import java.util.Scanner;		//importing header file for Scanner function...
public class FehToCelHw {		

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int S=sc.nextInt();		//start value or Fahrenheit value..
		int E=sc.nextInt();		//End value 
		int W=sc.nextInt();		//W is for gap or add these number to Start and then finding our next num cel...
		int c1;					//where c1 is my variable which we use for storing our calculation...
		
		while(S<=E)
		{
			c1=(5*(S-32))/9;
			System.out.println(S+"\t"+c1);	//here just printing that opt...
			
			S=S+W;		//and we are increase our S by gaping of W's value... or next valu...
		}
	}

}
