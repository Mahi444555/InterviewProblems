package String_2D_Array;
import java.util.Scanner;
public class PalindromeProgram_String2 {

	
	public static boolean isPalindrome(String str) {
	
	int i=0;
	int j=str.length()-1;

	//System.out.println(j);
	boolean b=false;
	while(i<str.length() || j>=0) 
	{
		
		System.out.println(str.charAt(i) + "==" + str.charAt(j));
		if(str.charAt(i) != str.charAt(j))
		{
			
			return false;
		}
		i++;
		j--;
		if(i==j)
			break;
	}
	return true;
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		boolean b=isPalindrome(str);
		System.out.println(b);
	}

}
