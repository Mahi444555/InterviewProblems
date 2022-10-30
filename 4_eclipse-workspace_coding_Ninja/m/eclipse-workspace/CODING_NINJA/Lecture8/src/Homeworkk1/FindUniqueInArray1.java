//program for find unique in array elements using function eg array of 5 = 10 20 10 30 20  only 30 is one time then 
			// print 30 only it's not reapeated
package Homeworkk1;
import java.util.Scanner;		
public class FindUniqueInArray1 {

	public static void  unique(int arr[])
	{
		
		for(int i=0;i<arr.length;i++) 		
		{
			int count=0;					
			
			for(int j=0;j<arr.length;j++)		
			{											
			
				if(arr[i]==arr[j])	
					count++;		
			}
			if(count==1)	{
				System.out.println( arr[i]);} 
		
		}
		
		//return -1; 			
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();		
		
		int  q=1;
		while(q<=t)		
		{
			
			int n=sc.nextInt();		
			int arr[]=new int[n];		
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();		
			}
			
			//int z= 
					unique(arr);		
											
			//System.out.println(z);
			q++;
		}

	}

}
