//program for push all zero's to end of an array...
//eg: 5 0 2 0 3 0 4   then 5 2 3 4 0 0 0 and maintain the order of numbers 

package HomeWork;

import java.util.Scanner;

public class push_zero_to_end_1 {

	public static void pushZero(int arr[]) {
		
		int n=arr.length;
		
		int pos=0;			//pos also index of array arr[pos]
		
		for(int i=0;i<n;i++) {//where i iteration is use for traversing array to check is non-zero
			if(arr[i]!=0) {		//or zero element contains in it...
				arr[pos]=arr[i];	//in these loop we done all non-zero elements to left no remain	
				pos++;						//ing all zeros's comes hence condition get false 
			}
		}
		for(int i=pos;i<n;i++) {	//here we storing in our array remaining zero in array arr from last updated value of pos till end
			arr[i]=0;							
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	
		int t=sc.nextInt();
		int q=1;
		while(q<=t) 
		{//no of test cases 1<2 , 2<=2
			System.out.println("take n= :"+q);
			int n=sc.nextInt();
			int arr[]=new int[n];		
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();	
			}
			pushZero(arr);		
			q++;
		}
	}
}
