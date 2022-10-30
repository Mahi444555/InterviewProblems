package String_2D_Array;
import java.util.Scanner;
import java.util.*;
public class REVERSE_Word {

	
	public static void RevString(String str) {
		
		int n=str.length();
		String s="";	//empty string
		
		for(int i=n-1;i>=0;i--) {
			s = s + str.charAt(i);		//here adding each word from last in empty string
		}
		System.out.print("REVERSE: "+"\t" +s);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();		//taking string from system
		
		RevString(str);	//calling funciton
		
	}

}
