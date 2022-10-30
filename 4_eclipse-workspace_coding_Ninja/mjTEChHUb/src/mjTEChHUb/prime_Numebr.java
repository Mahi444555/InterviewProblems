package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class prime_Numebr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2;
		while(i < num) 
		{
			if(num%i==0) 
			{
				System.out.println(" number not prime");
				break;
				
			}
			i++;
		}
		
	 if(i==num)
			{
				System.out.println("number is prime");
			}
	 
	  }
	}


