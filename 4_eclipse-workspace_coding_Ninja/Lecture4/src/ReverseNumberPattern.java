import java.util.Scanner;
public class ReverseNumberPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int k;
		
		while(i<=n)		//where i=line number or row number printing lines till n...
		{
			int j=1;
				k=i;
				
			while(j<=i)		//where j=columns in that always start from line number and then decreases
			{
				System.out.print(k);
				k--;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
