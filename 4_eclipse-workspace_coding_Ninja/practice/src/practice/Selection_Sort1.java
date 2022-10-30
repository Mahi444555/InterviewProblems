//selection sort is we just find smallest i.e. minimum element and just swap with index element for that
//we assume 1stly 0th index element is minimum (min=i) and then 2nd loop checking actually which element 
//is min and then update our min with that element index after comparing with all array elemnt we just 
// then swap that element which now stored in min directly with index element.. these is selectionSort
package practice;
import java.util.Scanner;
public class Selection_Sort1 {

	public static void selectionSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;	//let assume our minimum is 0th element
			
			for(int j=i+1;j<n;j++) {//compring with all element 
				if(arr[j]<arr[min]) {	//arr[1]<arr[0]
					min=j;		//just update our min with that minimum element index 
				}
			}
			int temp=arr[i];	//i.e. 0th element
			arr[i]=arr[min];	//directly swap with that element which stored in min
			arr[min]=temp;
		}
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
			}
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		selectionSort(arr);	
	}

}
