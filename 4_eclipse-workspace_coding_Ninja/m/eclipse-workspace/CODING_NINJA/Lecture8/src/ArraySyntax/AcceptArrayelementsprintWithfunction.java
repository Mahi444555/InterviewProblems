//program for the accept the array elements and reprint that using function
package ArraySyntax;
import java.util.Scanner;
public class AcceptArrayelementsprintWithfunction {

	
	public static int largestArray(int a[])
	{
		int max=Integer.MIN_VALUE;	//we are assign smallest or infinity value to max or we can also a[0] assign 
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
		}
		return max;		//here returning max in main function when it ll be called 
		
	}
	
	
	public static int[] takeInput() {		//in these function i'm not passing any value becuase it will directly return
										//value to main function when it's call by some variable 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];		//here declaring array of datatype int of name a[] and new is keyword that allocate
									//memory to us and passing [n] into array ie. my size
		for(int i=0;i<=n-1;i++)
		{
			a[i]=sc.nextInt();		//here accepting array elements from uesr till n-1 
		}
		return a;		
	}
	
	public static void print(int a[]) {		//2nd function & passing array type of value
		
		int n= a.length;		//here accessing array a's size i.e. n using .length function
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
			
		int x[]=takeInput();	//here calling takeInput function to take value of array elements and storing in 
								//variable x[] and giving [] these becuase now im accessing array 
		print(x);		//here calling print function and passing value x's i.e. stored array elements & print that
							// in print function from 0 to n-1 all elements 
		
		int largest=largestArray(x);		//here calling our largesArray Function which will return value of max
												// and we storing in a variable i.e. largest
		System.out.println("largest"+ largest);
	}

}
