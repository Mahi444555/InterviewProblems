package Searching_Sorting_algorithm;
import java.util.Scanner;
public class Insertion_Sort_Algorithm5 {

	
	public static void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<=n-1;i++) 	//insertionSort always start with 1st index element because assume
		{    						//0th ie. LHS element always sorted and outer loop iterate till less than n
			int temp=arr[i];	//let stored 1st element in temp
			int j=i-1;		//j=1-1=0 then j=0
			while(j>=0 && arr[j]>temp) {	//arr[0]>[1] always j is greater than equal to 0 
				arr[j+1]=arr[j];	//just stored 0th index element to next index location
				j--;
			}
			arr[j+1]=temp;	//after all comparision till j get -1 or out of loop then we stored at 0th location
							//now j's value form 1st pass is -1 then arr[-1+1]=arr[0]=temp 
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];		//passing n size to the array arr
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();	//taking array element storing in array till n size
	}
	insertionSort(arr);		//calling fucntion passing array...
	}

}
