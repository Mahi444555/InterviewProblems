package String_2D_Array;
import java.util.Scanner;
public class String_Func {

	
	public static void print(String str) {
		int n=str.length();
		System.out.println(n);
		for(int i=0;i<n;i++)
		{
			System.out.print(str.charAt(i));
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char ch='m';
		String str="mahesh";  //0 1 2 3 4 5 length=6 	//wher String=datatype; str=variable_name; 
														//and assigned "mahesh"string
		
		System.out.println(str.length());
		
		System.out.println(str);	            //here we directly accessing entire string and print
		System.out.println(str.substring(0));	//printing from zero index  till end 
		char c=str.charAt(0);					//we can't directly print character in java hence use 
												//String and refrece here printing 0th character..
		
		System.out.println(c);
		System.out.println(str.substring(1));	    // eg:(m a h e s h) it will/printing substring from 1st 
												//index till end
		System.out.println(str.substring(0,5));	//here we accessing/printing substring from StartIndex-endIndex
												//i.e. from 0th to 4th index but 4th index not print 4-1=3
		System.out.println(str.contains("mahe"));	//where str.contains()these func shows true/flase 
													//the string we passing through contins its part of
		                                          //original string or not if yes then true if not then false
		
		
		print(str);	//calling our print fun and passing string str 
	}

}
