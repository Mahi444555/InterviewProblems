import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		//int k=1;		//where these variable always increasing till our outer loop get false...
	
	while(i<=n)		// i=lines.
	{
		int j=1;
			while(j<=i)
			{
				System.out.print("*");
				
				j++;
			}
		System.out.println();
		i++;
	 }
	}

}
