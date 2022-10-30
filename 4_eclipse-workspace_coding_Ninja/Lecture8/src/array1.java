//program for the odd and even numbers in array using function 1st part i.e. 0th idex odd no and from lst 
//i.e. n-1 index is even and then decrease

import java.util.Scanner;
public class array1 {

//	public static void arrange(int arr[], int n) 
//	{
//    	//Your code goes here
//        int leftIndex = 0;
//        int rightIndex = arr.length - 1;
//        int val = 1;
//        while(leftIndex <= rightIndex)
//          {
//            if(val % 2 != 0){
//                 arr[leftIndex] = val;
//                val++;
//                leftIndex++;
//           }
//            else
//            {
//                 arr[rightIndex] = val;
//                val++;
//                rightIndex--;
//            }
//       }  
//	}
//           // public static int[] takeInput() {
//            	Scanner sc=new Scanner(System.in);
//            //	int n=sc.nextInt();
//            	//int arr[]=new int[n];
////            	for(int i=0;i<=n-1;i++)
////            	{
////            		arr[i]=sc.nextInt();
////            	}
//            //	return arr;
//         //   }
//          
//            	public static void main(String []args){
//                    Scanner sc=new Scanner(System.in);
//                    int n=sc.nextInt();
//                    int arr[]=new int[n];
//            		//int arr[]=takeInput();
//                    arrange(arr,n);
//                    for(int i=0;i<arr.length;i++){
//                        System.out.print(arr[i]+" ");
//                    }
//                    
//                
//
//	}
	
	
	
	public static void arrange(int arr[],int n) {//my_function name arrange and passing array and n's value
		
		int leftIndex=0;
		int rightIndex=arr.length-1;		//.length access size of an array
		int val=1;
		while(leftIndex<=rightIndex)
		{
			if(val%2!=0) {
				
			arr[leftIndex]=val;		//which means i'm storing odd numbers in 0th location 
			val++;
			leftIndex++;
			}
			else
			{
				arr[rightIndex]=val;		//if not odd then that no is even and storing in from last index and decre
				val++;
				rightIndex--;
			}
		}
		
	}

	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();  //choice
		int j=1;
		while(j<=t) {
		int n=sc.nextInt();
		int arr[]=new int[n];		//creating array & having size of n
		arrange(arr,n);		//calling function it will gives us odd and even no till n 
		for(int i=0;i<=arr.length-1;i++)		//0 to n-1 
		{
			System.out.print(arr[i]+" ");
		}
		
		}
		
	}
}