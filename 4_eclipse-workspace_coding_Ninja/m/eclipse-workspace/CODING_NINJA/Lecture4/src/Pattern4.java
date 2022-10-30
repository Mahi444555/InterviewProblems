import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)		//i=lines/row number print
		{
			int j=n;
			while(j>=1)		//j=columns in that printing numbers 
			{
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
