//program for print all substring with prefix i.e. 1st character 
package String_2D_Array;
import java.util.Scanner;
public class print_All_Subsrting_onlyPrefix {

	public static void printPrefix(String str) {	//passing String str
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(0,i+1));	//0<6= starting i=0 then 0 to 0 and endIndex-1 i.e. 0-1=-1
		}										//hence -1 location printing null or nothing 1st line
												//1<6= i=1 then printing substring form 0 to 1-1(endIndex) = 0th index= m print
												//2<6= i=2 then printing substring form 0 to 2-1(endIndex) not count hence 0 to 1 index = ma
														
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		//String str="mahesh";	
		
		printPrefix(str);
	}

}
