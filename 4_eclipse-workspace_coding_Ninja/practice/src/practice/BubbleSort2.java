package practice;
import java.util.Scanner;
public class BubbleSort2 {

	
	public static void bubbleSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) 
		{
			int flag=0;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j] > arr[j+1]) 
				{
					int temp=arr[j];	//temp=arr[0]
					arr[j]=arr[j+1];	//arr[0]=arr[0+1]
					arr[j+1]=temp;		//arr[1]=temp i.e. 0th
					flag=1;
				}
			}
			if(flag==0)
				break;
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);	//calling function
	}

}
