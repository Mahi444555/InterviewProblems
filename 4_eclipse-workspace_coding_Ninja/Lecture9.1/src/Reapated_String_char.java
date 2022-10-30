import java.util.Scanner;
import java.util.*;

public class Reapated_String_char {

public  static void cout(String str)
{ 
	System.out.println(""+str);
int n=str.length();
System.out.println(n+"\t");
/*if(str=="" || str==" ")
	{
		System.out.println("invalid String");
	}
*/
for(int i=0;i<n;i++)
{
	boolean flag=true;
	for(int j=0;j<n;j++) 
	{
		if(str.charAt(i)==str.charAt(j) && (i!=j))
		{
			flag=false;
			break;
		}	
		
	}	
	if(flag==true)
	{
		System.out.println(str.charAt(i)+"\t");
		//break;
	}	 

}
		
}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);	//here we creating Scanner object
		System.out.println("enter the string");
		String str=sc.nextLine();	//if u want to take string use string datatype and use nextline because it read next word after space or tab etc...
		
		cout(str);
		
		//System.out.println(result+"\t");
	}

}
