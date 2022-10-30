package SEARCHING_PROGRAMS;
import java.util.Scanner;
public class Selection_sort1 
{

	/* selection sort working like 0th index element always be assumed its minimum and there are two
	 sub-arrays 1st LeftHand is sorted and 2nd RightHand is unsorted sub-array   just find minimum elements
	 from unsorted sub-array and just assign that index to the min and then directly swap with largest elemtnt*/
	
	public static void SelectionSort(int arr[])
	{
		int N=arr.length;	
		for(int i=0;i<N-1;i++) 		//here only taking i<N-1 i.e. N-2 because last elements get sorted automatically
		{
			int min=i;
			for(int j=i+1;j<N;j++)	//comparing 1st and next elemtnt if 1st is greater then swap
			{
				if(arr[min] > arr[j])
				{
				 min=j;	//here just assigning the minimum index elemnt to the min 
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[j]+"\t");
	}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();	
		int arr[]=new int[N];	//here we declaring the array and passing the array size as N
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	//taking the  elements from system and storing in array
		}
		SelectionSort(arr);	//here we calling the our function i.e. SelctionSort
	}
}
