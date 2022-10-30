package SEARCHING_PROGRAMS;
import java.util.Scanner;
public class Binary_Search2 {


	public static int binarySearch(int arr[], int x) 
	{
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		
		while(start<=end)	//here we taken <= because already we assing end=n-1
		{
			//1stly compare with middle index element matched or not
			int mid=(start+end)/2;
			if(arr[mid]==x) 
			{
				return mid;	//if our number is matched then return middle index
			}
			else if(x > arr[mid])
			{
				start=mid+1;	//if our number x is greater than middle then chenge start
			}
			else	//these for is number is less than middle elements then only search from 0 to till mid-1 index
			{
				end=mid-1;
			}
		}
		return -1;
	}
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int x=sc.nextInt();	//wehre x is no to be matched in the Array list
	int arr[]=new int[N];	//here we declaring an Array of size N
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();	//here we taking an Array elements from System and storinginArray
	}
	
	//sorting of array
	for(int l=0;l<arr.length;l++)
	{
		for(int m=l+1;m<arr.length;m++)
		{
			if(arr[l]>arr[m])
			{
				int temp=arr[l];
				arr[l]=arr[m];
				arr[m]=temp;
			}
		}
	}
	for(int a=0;a<arr.length;a++)
	{
		System.out.print(arr[a]+"\t");
	}
	int result=binarySearch(arr,x);//here we calling the function
	System.out.println(result);
}	

}
