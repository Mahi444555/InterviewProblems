package PracticeProblem;
import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=1;
		while(i<=N)		//lines printing
		{
			int j=1;
			while(j<=i)		//columns only iterates till i or line number
			{
				System.out.print((char)(i+64));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
