package String_2D_Array;
import java.util.Scanner;
public class Reverse_String_wordWise {
	
	public static String reverseWordWise(String str) {
		int n=str.length();								//assign length of string to n
		int start;										//it will assign by index no after 1st space frm last i.e 1st word frm Last
		int end=n;
		
	String temp="";										//here declaring empty temporary empty string
	for(int i=n-1;i>=0;i--)
	{
		if(str.charAt(i)==' ') 							//checking at string index ith contains space or not
		{
			start=i+1;	                     			//if ith index contains empty spce i.e nothing but its we find word which start form space index + 1 
			temp=temp +(str.substring(start,end))+" ";	//1stly contains last word
			end=i;										//and update our end by wher we found space 
		}
	}
		temp=temp+(str.substring(0,end));		
		//here storing 1st word from 0 to end-1 
		return temp;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();						//it will read after token/spaces also hence nextLine
		String name=reverseWordWise(str);				//calling function and passing value
		System.out.print(name);
	}

}
