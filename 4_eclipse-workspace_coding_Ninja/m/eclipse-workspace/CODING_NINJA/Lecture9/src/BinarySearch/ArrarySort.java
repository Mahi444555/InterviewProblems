package BinarySearch;
import java.util.Scanner;
public class ArrarySort {

	
	public static int binarySearch(int arr[], int x) {
		
		int n=arr.length;
		int start=0;
		int end= n-1;
		
		while(start<=end)
		{
			int mid=start+end/2;
			if(arr[mid]==x)
			{
				return mid;		//if our x is matched with mid element then we return index of mid
			}
			
			else if(x>mid)		//if x i.e. number is greater than mid no then search RHS of mid
			{
				start=mid+1;	//then our start start from one element more than mid to end
			}
			else
			{
				end=mid-1;		//other wise our number is less than mid no then search LHS of mid
						//where start is became as it is from 0 but end is change one no less thn mid
			}
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//int N=sc.nextInt();
		int t=sc.nextInt();
		//int x=sc.nextInt();
		
		int q=1;
		while(q<=t)		//these is my no of test case/querryes to be run 
		{
			System.out.println( "enter N value");
			int N=sc.nextInt();
			System.out.println("enter x value");
			int x=sc.nextInt();		//x is target no which we have to matched in array 
			int arr[]=new int[N];
			System.out.println("accept array elements");
			for(int i=0;i<N;i++)
				
			{
				arr[i]=sc.nextInt();		//reading array elements from user and storing in array 
			}
			
			int result=binarySearch(arr,x);
			System.out.print("X is found at index location "+result+" ");
			q++;
		}
		
		
	}

}
