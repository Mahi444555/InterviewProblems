//program for the check permutaions of two strings is both contains same each character with combinations
//if yes then return true else false use boolean as datatype for return only true or false

import java.util.Scanner;
import java.util.*;//these header files stored sort() function 
//import java.util.Arrays;//these header files also stored many predefined functions
public class HWPermutationOfTWoString {

	public static boolean permutation(String str1,String str2,String str3) {//boolean is datatype of func permutaion()
		
		//firstly to check 2nd string is permutation i.e. all characters are same which are in 1st string 
		//but only they arranged then these string is permutation of 1st i.e. arranged
		//step 1: convert both strings into character array separately 
		//step 2: then sort both character array 
		//step 3: then check both sorted character array now is both contains same characters or not 
		//         to check both contains same character use .equal() function i.e. string function
			//     used for to check two character sting contains each character same 
		
		char c1[]=str1.toCharArray();	//we converting str1 to character array then used these funciton String_name.toCharArray();
		char c2[]=str2.toCharArray();
		char c3[]=str3.toCharArray();
		
		Arrays.sort(c1);//these function used to sorting purpose
		Arrays.sort(c2);
		Arrays.sort(c3);
		
		//here initializing c1 and c2 i.e. sorted character array to our original strings again
		
		str1=new String(c1);
		System.out.println("sorted 1st:"+str1);

		str2=new String(c2);
		System.out.println("sorted 2nd:"+str2);
		
		str3=new String(c3);
		System.out.println("sroted 3rd:"+str3);
		if(str1.equals(str2) && str1.equals(str3)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating Scanner object to take input from system
		System.out.println("enter 1st string");
		String str1=sc.nextLine();//taking 1and 2md string here
		System.out.println("enter 2nd String");
		String str2=sc.nextLine();
		System.out.println("enter  3rd String");
		String str3=sc.nextLine();
		
		boolean b=permutation(str1,str2,str3);//calling the function permutaion and passing two string 
		System.out.println("Strings are: "+b);
		
	}

}
