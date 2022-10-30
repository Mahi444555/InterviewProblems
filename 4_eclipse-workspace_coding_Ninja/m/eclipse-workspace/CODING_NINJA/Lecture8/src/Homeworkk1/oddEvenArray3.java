package Homeworkk1;
import java.util.Scanner;
public class oddEvenArray3 {

	public static void arrange(int arr[], int n)
	{
		int leftIndex=0;
		int rightIndex=arr.length-1;
		int val=1;
		
		while(leftIndex<=rightIndex)
		{
			if(val%2 != 0)
			{
				arr[leftIndex]=val;
				val++;
				leftIndex++;
			}
			else
			{
				arr[rightIndex]=val;
				val++;
				rightIndex--;
			}
			//System.out.println();
		}
	}

		public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();		//t=choices
		
		int l=1;
		while(l<=t)		
		{
			int n=sc.nextInt();
			
			int arr[]=new int[n];	//these only empty array of size n user entered 	
			
			arrange(arr,n);		//& here i'm passing that empty array to arrange function
									
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+"\t");
			}
			l++;	
		}
	}
}  
