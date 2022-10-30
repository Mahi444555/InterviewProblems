import java.util.Scanner;
public class DimondOfStarsHw {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	
	int n1=(N+1)/2;
	int n2=n1-1;
	
	int i=1;
	while(i<=n1)
	{
		int k=1;
		while(k<=n1-i)
		{
			System.out.print(" ");
			k++;
		}
		int j=1;
		while(j<=(2*i-1))
		{
			System.out.print("*");
			j++;
		}
	System.out.println();
	i++;
	}
		
	 i=n2;
	 while(i>=1)
	{
		int s=1;
		while(s<=(n2-i+1))
		{
			System.out.print(" ");
			s++;
		}
		int j=1;
		while(j<=2*i-1)
		{
			System.out.print("*");
			j++;
		}
		System.out.println();
		i--;
	}
	
  }
	
 }


