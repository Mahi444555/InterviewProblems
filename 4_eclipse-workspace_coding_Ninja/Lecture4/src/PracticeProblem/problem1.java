package PracticeProblem;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)		//i=lines/rows 
		{
			int j=1;
			while(j<=i)		//j/columns iterates till line number i.e. i
			{
				System.out.print((char)(j+64));
				j++;
			} System.out.println();
			i++;
		}
	}
	

}
