//program for find 2nd largest
package HomeWork;
import java.util.Scanner;
public class secondLargestELEMENT3 {

	
//	public static void SecondLar(int arr[]) {
//		
//		int n=arr.length;
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1; j<n;j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;		//swapping largest element to 0th index
//				}
//			}
//		}
//		for(int i=0;i<n;i++)
//			System.out.print(arr[i]+" ");
//		System.out.println();
//		System.out.print(arr[1]+" ");
//	}
	
	
	public static int SecondLar(int arr[])
	{
		int n=arr.length;
		int L1=Integer.MIN_VALUE;
		int s=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>L1){//i.e. array index element is larger than L1 then update L1 by arr[i]
				
				s=L1;	//before that assgin L1's value to s i.e. second largest now
				L1=arr[i];
			}
			if(L1>arr[i] && arr[i]>s) {//if arr[i]th element is less than L1/larger & more thna s
				s=arr[i];
			}
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];	//my array
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=SecondLar(arr);	//calling function and passing unsorted array
		System.out.print(result);
	}

}
