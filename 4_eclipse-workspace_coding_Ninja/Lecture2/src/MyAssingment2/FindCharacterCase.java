package MyAssingment2;
import java.util.Scanner;
public class FindCharacterCase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);		//declaring sc for scanning or accepting data from system..
		String str=sc.next();
		char c=str.charAt(0);		//using string datatype we are taking single character as input.. at 0th loc..
		
		if((c>=65)   &&  (c<=90))		//these is for Capital alphabet..
		{
				System.out.println("1");
		}
		else if((c>=97)  &&  (c<=122))		//these condition for small alphabets...
		{
				System.out.println("0");
		}
		else								//else not 
		{
				System.out.println("-1");
		}

		
		
		
		
	}

}
