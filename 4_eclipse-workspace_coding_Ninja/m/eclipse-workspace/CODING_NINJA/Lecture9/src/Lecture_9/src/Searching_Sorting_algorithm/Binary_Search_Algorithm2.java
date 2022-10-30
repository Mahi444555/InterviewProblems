package Searching_Sorting_algorithm;
//program for Search a number/element using Binary search 
/*
Note:-Binary_search only works on sorted array i.e. ascending or descending
 Binary Search is nothing but we divide our array into two parts left and right in that
 left side element =start/leftIndex=0 and rightIndex/end=n-1; and firstly find middle element
 i.e. mid=start+end/2; and check firstly check that no x with middle index element if matched then 
 just return whre it's matched that index and if not matched then
 check is our number x is greater than mid then search that no right-side mid because all element of 
 after arr[mid] are greater than mid or if x is less than mid then search it left-side of mid elemnt
 */
import java.util.Scanner;
public class Binary_Search_Algorithm2 {
	
	public static int binarySearch(int arr[],int x) {
		
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		
		while(start<=end)
		{	
			int mid=(start+end)/2;
			if(arr[mid]==x) {	
			
				return mid;
			 
			}
			else if(x > arr[mid])
			{
				start=mid+1;
			}
			else 
			{	
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int x=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int m=binarySearch(arr,x);	//calling function and passing arr and x
		System.out.print(m);
	}

}
