
package Homeworkk1;
import java.util.Scanner;

public class FindDuplicatElement2 {
	
	public static int duplicateElement(int a[])		
	{
		 for(int i=0;i<=a.length-1;i++)		
		{
			 int count=0;		
			 					 
			 for(int j=0;j<a.length-1;j++)	
			 {
				 if(a[i]==a[j])	
					 					
					 count++;			
			 }
			 
			 if(count==2)			
				 System.out.print(a[i]+"\t");
		}
		 
	 return -1;	 
	}
	
	
	
  public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();		
		int q=1;
		while(q<=t)		
		{
			int n=sc.nextInt();		
			int arr[]=new int[n];		
			for(int i=0;i<=n-1;i++) 
			{
				arr[i]=sc.nextInt();		
			}
			
			int m =duplicateElement(arr);		
			System.out.println(m);	
			q++;
		}
	}

}
