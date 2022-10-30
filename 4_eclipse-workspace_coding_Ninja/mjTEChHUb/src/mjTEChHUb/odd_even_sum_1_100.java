package mjTEChHUb;
import java.util.Scanner;
import java.util.*;
public class odd_even_sum_1_100 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int start=1;
		int end=100;
		int evensum=0,oddsum=0;
		while(start<=end) 
		{
			if(start%2==0) 
			{
				evensum=evensum+start;
			}

			else
			{
				oddsum=oddsum+start;
			}

			start++;
		}
		System.out.println("evensum:"+evensum+"\t");

		System.out.println("oddsum:"+oddsum+"\t");

	}

}
