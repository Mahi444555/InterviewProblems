package lecture1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		
		
		//Scanner s= new Scanner(System.in);		//where Scanner=Datatype and s= variable, accepting from system hence
												//(System.in) and new Scanner is that making new machine for scan..
//		
//		int a= s.nextInt();
//		int b= s.nextInt();
//		
//		
//		System.out.println(a+b);
//		
//
//		String str;			//where String= datatype, str= variable_name,
//		str=s.next();			//here we are taking vaues of str from user using s which is input variable..
//		System.out.print(str);		//here printing.
		
		
		
//		
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		String str = s.next();		//here we only writ =s.next(); not =s.nextLine(); hence it will only print 1st 
//									//	string abc def then oly abc 
//		System.out.print(a);			//these only print(a); not println(a); hecne not print new line..
//		System.out.println(str);
		
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();
		System.out.print(str + " " + a);
	}

}
