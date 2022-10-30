package Searching_Sorting_algorithm;
import java.util.Scanner;//header files for scanner

public class Merge_Sort_Algorithm {//class name
	
	public static int[] merge(int arr1[], int arr2[])
	{
	int i=0,  j=0,  k=0;
	int ans[]=new int[arr1.length + arr2.length];	//my new 3rd array of  size array1 + array 2	
	while((i<arr1.length) && (j<arr2.length))		//0<arr1.length && 0<arr2.length
	{
		if(arr1[i] < arr2[j]) 
		{
			ans[k]=arr1[i];		//if arr1[0] is small than arr2 then store in 3rd array 
			k++;
			i++;
		}
		else
		{
			ans[k]=arr2[j];		//else 2nd array elemnt is small store in 3rd array 0th index
			k++;
			j++;
		}
	}
	
		while(i<arr1.length) 
		{	//if remains eleemnt in 1st array then stored as it in 3rd array
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) 
		{
			ans[k]=arr2[j];
			k++;
			j++;
		}
		return ans;		//just returning 3rd array ans to main again
		
	}
	

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();	//taking array1 element from System
		}
		int arr2[]=new int[n];
		for(int j=0;j<n;j++)
		{
			arr2[j]=sc.nextInt();	//taking array2 element from System
		}
	int ans[]=merge(arr1,arr2);		//function calling
		for(int i=0;i<ans.length;i++) 
		{
		System.out.print(ans[i]+" ");
		}
	}
}
