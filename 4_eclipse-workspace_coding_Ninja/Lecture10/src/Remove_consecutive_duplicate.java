import java.util.Scanner;
import java.util.*;
public class Remove_consecutive_duplicate {

	
	public static void removeConsecutiveDuplicates(String str1) {
		int n=str1.length();
		char c1[]=str1.toCharArray();
		Arrays.sort(c1);
	    str1=new String(c1);//here again assigning sorted character array to str1
		System.out.println("sorted string is\t" + str1);
		for(int i=0;i<n;i++) 
		{ 
		  int count=0;
			for(int j=0;j<n;j++) 
			{
				if(c1[i]==c1[j]) 
				{
				 count++;
				 if(count==1) {
				 System.out.print(str1.charAt(i));
				 }
				 c1[i]=Character.MIN_VALUE;

	     	}
//				if(count==1 || count>1) 
//				{
//						System.out.print(str1.charAt(i));
//						i=Integer.MIN_VALUE;
//					
//				}
				
			}
	  }
				
}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=sc.nextLine();
		
		removeConsecutiveDuplicates(str1);//calling function and passing string
	//	System.out.print(s+"\t");
		
	}

}
