import java.util.Scanner;
public class starsdinmond {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=(n+1)/2;			//(7+1)/2=4
		int i=1;
		while(i<=n1)
		{
			int k=1;
			while(k<=n1-i)		//1<=4-1 i.e. 1<=3 then 1st line 3Spaces
			{
				System.out.print(" ");
				k++;
			}
			
			int j=(2*i)-1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			j=2;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			
			int n2=n1-1;
			
			System.out.println();
			i++;
				
		}
	}

}
