package String_2D_Array;
import java.util.Scanner;
public class CountWord1 {

	public static int count(String str) {	//String=datatype and str=string_name
		int n=str.length();
		System.out.println(n);
		
		
		if(str =="" || str==" ")//here checking our string contains null(empty) or only spaces then retur/exit
		{
			return 0;
		}
		int count=1;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')	//if we want to traverse of each alphabet in string use charat(0) then char(
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		//String str="mahesh jadhav is the best programmer in the world";	//declaration of String 
		int result=count(str);	//calling function count and passing our entire string
		System.out.println(result);
	}

}
