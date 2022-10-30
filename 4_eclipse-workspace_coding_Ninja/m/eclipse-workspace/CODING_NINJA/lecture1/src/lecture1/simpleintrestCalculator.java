package lecture1;
import java.util.Scanner;
public class simpleintrestCalculator {
	
public static void main(String[] args) {
	
	Scanner a = new Scanner(System.in);
	//Scanner scan= new scanner(System.in);
	System.out.println("Enter Principal rate and time: ");
	int p= a.nextInt();																//principal
	int r= a.nextInt();																	//rate
	int t= a.nextInt(); 																	//time
	
	int si= (p*r*t)/100;																//here calculating simple interest 

	System.out.println(si);																//here simply printing that 
	
		}
}

//program for multiplication of two numbers accept from users..


//package lecture1;
//
//import java.util.Scanner;
//
//public class simpleintrestCalculator {
//	public static void main( String[] args)
//	{
//		Scanner m= new Scanner (System.in);
//		System.out.println("enter a and b's values:");
//		int a= m.nextInt();			//where m is variable name for which we already declare with scanner 
//		int b= m.nextInt();
//		
//		int c= a*b;
//		System.out.println("multiplication of two number:");
//		System.out.println(c);
//	}
//}