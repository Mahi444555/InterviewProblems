import java.util.Scanner;
import java.util.*;
public class array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();	//taking input form system...
		int i,j,count=1,k;
		int arr[]=new int[n];	//declaration of array in java and passing n 
		
		for(i=1;i<=n;i++)
		{
			for( k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
				System.out.print(count+" ");
				count++;
				}
				System.out.println();
			}
		}
	}
}	
  


