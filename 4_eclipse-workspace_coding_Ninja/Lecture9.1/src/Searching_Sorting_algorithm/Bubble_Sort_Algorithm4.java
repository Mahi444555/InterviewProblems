package Searching_Sorting_algorithm;
import java.util.Scanner;
public class Bubble_Sort_Algorithm4 {

	
	public static void bubbleSort(int arr[]) {
		
		int N=arr.length;		//accessing array length 
		for(int i=0;i<N-1;i++)	//increase if n=5 0 to 0<5-1 0<4 outerloop 
		{
			int flag=0;
			for(int j=0;j<N-1-i; j++)	//0<5-1-0 i.e. 0<4 1<4 2<4 3<4    4<4 flase
			{ 
				
				if(arr[j]>arr[j+1])	//1st no is greater than 2nd no then swap
				{
					int temp=arr[j];	//assign 0th element to temp
					arr[j]=arr[j+1];	//1st no assign by 2st 
					arr[j+1]=temp;
					flag=1;
				}		
			}
			if(flag==0) 
				break;
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];		//my_Array of arr having size n
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=sc.nextInt();		//storing our array with elements
		}
		bubbleSort(arr);		//calling bubbleSort fucntion and passing array
	}

}
