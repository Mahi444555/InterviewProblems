package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class Factorail_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}	
		System.out.println(fact+"\t");
	}

}
