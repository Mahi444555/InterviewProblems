import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)		//i=lines/row number print
		{
			int j=1;
			while(j<=n)		//j=columns in that printing numbers 
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
