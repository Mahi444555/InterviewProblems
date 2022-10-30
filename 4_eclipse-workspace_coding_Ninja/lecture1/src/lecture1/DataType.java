package lecture1;
import java.util.Scanner;
public class DataType {
	public static void main(String[] args)
	{
		
//		char c='a';
//		System.out.println(c+3);	//here adding char + int = integer ,convert character into it's ascii value int.
//		
//		int i=c+10;				//here adding char + integer and storing in integer gives integer...
//								//i.e. 4 byte= 1-byte + 10; storing 1 byte in 4 byte possible..
//		System.out.println(i);
//				i=c; 	//here i is integer(4-b) & char c is (1-byte) storing possible.
//but integer can't store in char..
		//char abc=i;
		 		//not possible integer i cant store in char acb...
		
//		long l=i;		//possible in long we can store anything i.e. 8bytes and integer is 4 byte 
//				int a=10;	//2-byte
//		double d;
//
//		d=a; //possible in double storing integer 4b in 8byte...
//		
	   //a=d; cant soter in integer double.
		//by defaulty any decimal digit or number is double... eg float a=10.5 its double 
		//then if you want to convert into float then float a=100.5f now its 4-bytes..
		
		//float f=1.4;
		//System.out.println(f);
		//System.out.println('a'+1);
	//	int m='c';
		//System.out.println(m);
		//What is the error in this code?
//				byte b = 50;
//				b = b * 50;
//		double a = 6 / 4;
//		System.out.println(a);
//        int b  = 6 / 4;
//        System.out.println(b);
//        double c = a + b;
//        System.out.println(c);
		
//		
//		        double a = 55.5;		//double a i.e. 8 byte...
//		        int b = 55;					// integer 4 byte..
//		        a = a % 10;					//double a=55.5  then double%10 gives double
//		        b = b % 10;					//integer b=b%10; int%int=int...
//		        
//		        System.out.println(a + " "  + b);
//		      
		 int var1 = 5;
	        int var2 = 6;
	        System.out.print(var1 > var2);
	}
}
