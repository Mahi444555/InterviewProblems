/*program for the make 3 function 1st for largestArray 2nd takeInput in which we using Scanner and taking input 
 taking N's value and making array of int and passing n's value as a size then accepting array elements and storing in 
 array index and returning a value of array i.e. stores all vlaue of array and then 3rd function print()
  which we are using to print all array elements and accesing here or passing a[] i.e. array to function and 
  in main just calling function 
  */
import java.util.Scanner;
public class ArrayandFuncitonLecture8 {

	public static int largestArray(int a[]) {	//1st function find largest array elements passing a[] i.e array
		
		//int max=Integer.MIN_VALUE;		//i'm assign smallest value to my max to compare with other no
		 int max=a[0];
		for(int i=0;i<=a.length-1;i++)		//checking each index and finding max a.length wher (a=my array) .length 
		{									//using that i'm accessing array length (array_name.length) gives me length
			
			if(a[i]>max)		//here comparing which index array is maximum 
			{
				max=a[i];
			}
		}
		return max;
		
	}
	
	//minimum
	public static int minimum(int a[])	//passing array a[]
	{
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)		//where i<=a.length is 0<=5-1 if n=5 and .length access array size/length
												//using array_name.length
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	//2nd function is for take input from user n's value and my array declaration
	public static int[] takeInput()		//here noting passing in function takeInput() because it will directly return
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];		//a[]=my array & passing n's value as size of array new is keyword that allocate memeory
								//of any datatype in these func it allocate memory and we storing integers
		for(int i=0;i<=n-1;i++)
		{							//if  n=5   0 to n-1 i.e. 5-1=4
			a[i]=sc.nextInt();		//accepting array element & storing in index of array	a[0] a[1] a[2] a[3] a[4] 
		}
		return a;		//here returning array i.e. a which stored now all elements 
	}
	
	
	public static void print(int a[])	//3rd function for reprint all elements from 0 to n-1 array elements
	{								//here passing array which return by previous function
		
		for(int i=0;i<=a.length-1;i++)		//a.length access array length syntax=array_name.length eg(a.length)
		{
			System.out.print(a[i]+" ");		//and here reprinting that all elelements 
			
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[]=takeInput();		//calling takeInput func and and storing in arr[] variable now i take [] brackets
									// because now we storing array elements in that hence take variabl also array type
		print(arr);	//here just calling print() function and passing arr value i..e now stored all array elements 
		
		int lar=largestArray(arr);		//here calling largestArray() function and also passing arr which stored now 
												//array elements
		System.out.println("Maximum is"+lar);
		
		int small=minimum(arr); 		//here calling minimum function 
		System.out.println("Minimum is"+small);
		
	}

}
