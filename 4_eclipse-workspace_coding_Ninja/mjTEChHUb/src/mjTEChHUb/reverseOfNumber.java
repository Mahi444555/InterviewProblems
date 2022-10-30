package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class reverseOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,rev=0;
		while(num>0) 
		{
			rem=num%10;
			rev=(rev*10)+rem;
			//System.out.println(sum);
			num=num/10;
		}
		System.out.println("reverse"+rev);
	}

}
