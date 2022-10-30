package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class printEVEN_Between {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int start=50;
		int end=120;
		int sum=0;
		while(start<=end) {
			if(start%2==0)
			{
				sum=sum+start;
				System.out.print("even "+start+"\t");
				
			}
			else {
				System.out.println("odd :"+start);
			}
			start++;
		}
	}

}
