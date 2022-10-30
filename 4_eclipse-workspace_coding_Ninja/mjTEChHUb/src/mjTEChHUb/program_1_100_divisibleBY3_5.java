package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class program_1_100_divisibleBY3_5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int start=1;
		int end=100;
		
		while(start<=end) 
		{
			
			 if(start%3==0 && start%5==0) 
				{
					System.out.println("divisible by both 3&5:" + start+"\t");
				}
			 else if(start%3==0)
				{
					System.out.println("divisible by 3:" +start+ "\t");
				}
			else if(start%5==0)
				{
				  	System.out.println("divisible by 5:" +start+ "\t");	
				}
			
			start++;
		}
	}

}

