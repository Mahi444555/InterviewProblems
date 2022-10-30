import java.util.Scanner;
public class TriangleOfNumberHw {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int k=1;
			while(k<=n-i)
			{
				System.out.print(" ");
				k++;
			}
			int j=1;
			int val=i;
			while(j<=i)
			{
				System.out.print(val);
				val++;
				j++;
			}
			j=2;
			int m=2*i-2;		//when i=2 for 2nd half 2nd line 2*2-2=2
			while(j<=i)
			{
				System.out.print(m);
				m--;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
