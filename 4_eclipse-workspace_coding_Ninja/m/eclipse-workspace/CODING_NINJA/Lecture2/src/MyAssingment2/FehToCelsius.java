//Program for convert tempreture fehrenheit to Celsius..

package MyAssingment2;
import java.util.Scanner;	//header file for Scanner function...
public class FehToCelsius {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int f=sc.nextInt();		//taking fahrenheit value from user..
		int cel=( 5*(f-32))/9;		//calculating fahrenheit to celsius  using these formula...
		
		System.out.print(f+"\t"+cel);
		
		
	}

}
