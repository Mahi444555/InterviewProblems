package lecture1;

import java.util.Scanner;

public class add2num {

	public static void main (String args[]) 
	{
		System.out.println("enter values");
		Scanner scan = new Scanner(System.in);	//these is noting but for taking numbers from user =scan is variable name let say...
		
		int a=scan.nextInt();			//integer datatype stores 4 bytes by defaultly. 
		int b=scan.nextInt();
		int sum;
		
	sum=a+b;
	
	System.out.println(sum);
		
//	short s=123; 					//short only stores 2 bytes eg. short int a; then it's storing 2 byte
//	long l=12345L;					//long int stores 8 byte
//	double d=12.3;					//double its a floating datatype it's double the float if float=4 then double is 8
//	
//	char c= 'a';					//character size = 1 byte
//	
//	boolean k=true;					//boolean only stores 1&0 i.e. true & flase and alwayes initialize with true or flse
//	boolean otherk=false;
//	
	
		
		
	}
	
}