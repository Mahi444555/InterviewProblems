package PracticeProblem;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=N;
		while(i>=1)
		{
			int j=1;
			int k=i;
			while(j<=N)
			{
				System.out.print(k);
				k++;
				j++;
			}System.out.println();
			i--;
		}
	}

}
