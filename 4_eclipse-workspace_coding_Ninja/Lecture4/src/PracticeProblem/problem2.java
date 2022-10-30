package PracticeProblem;		//package_name..
import java.util.Scanner;		//import header files..
public class problem2 {			//class_name..

	public static void main(String[] args) {	//My main_function...
		
		Scanner sc=new Scanner(System.in);		
		
		int N=sc.nextInt();
		int i=N;
		while(i>=1)
		{
			int j=1;
			while(j<=i)							//these loop is for print 1st half from 
			{
				System.out.print(j);
				j++;
			}
			
			int k=i;
			while(k<N)							//these loop for print spaces 1st half
			{
				System.out.print("*");
				k++;
			}
			 k=i;
			while(k<N)							//these loop for print spaces 2nd half
			{
				System.out.print("*");
				k++;
			}
			
			j=i;									//here these j's loop for print next half from reverse till 1
			while(j>=1)
			{
				System.out.print(j);
				j--;
			}
			
			
			System.out.println();
			i--;
		}
	}

}
