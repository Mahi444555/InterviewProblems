import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
	
	while(i<=n)		// i=lines.
	{
		int j=1;
			while(j<=i)
			{
				System.out.print(i);
				
				j++;
			}
		System.out.println();
		i++;
	 }
	}

}
