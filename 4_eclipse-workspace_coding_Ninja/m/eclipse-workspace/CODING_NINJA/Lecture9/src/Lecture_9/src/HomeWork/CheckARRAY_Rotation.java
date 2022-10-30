//program for check how many times array is rotated and simple approch is find minimum arry elemt
//and stored that elemnt in min and simplay return that elemtn index (traverse-array)
package HomeWork;
import java.util.Scanner;
public class CheckARRAY_Rotation {

	
	public static int ArrayRotation(int arr[])
	{
		int n=arr.length;
		int k=0;
		int min=arr[0];	//let suppose minimum is 0th index element for condition comperison 
		for(int i=0;i<n;i++)	//0<5; 1<5; 2<5; 3<5; 4<5; 5<5false
		{					//eg: N=5 and array 10 20 30 1 2
			if(min > arr[i])	//checking 10>10flase; 10>20false; 10>30false; 10>1True
			{
				min=arr[i]; 	//if condition get true then just assing that elemt to min 
				k=i;				//& here again assing that elemtn index and return k 
			}
		}
		return k;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int q=1;
		while(q<=t)//no of teset cases to be run
		{
			int n=sc.nextInt();
			int arr[]=new int[n];	//declaring array arr and passing size as n
			for(int i=0;i<n;i++)	//these loop iterate till n-1 and we taing array elemtn till n-1
			{
				arr[i]=sc.nextInt();
			}
			int result=ArrayRotation(arr);//calling function and passing array arr
			System.out.println(result+" ");
			q++;
		}
	}

}
