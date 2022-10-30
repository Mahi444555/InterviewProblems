package mjTEChHUb;
import java.util.Scanner;
import java.util.*;

public class Program_PerfectNUmber_remainderZERo {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int i=1,sum=0;
		while(i<=no/2) 		//same as i<=number 
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(no==sum)
		{
			System.out.println("its perfect");
		}
		else 
		{
			System.out.println("not perfect");
		}
		

	}
}


