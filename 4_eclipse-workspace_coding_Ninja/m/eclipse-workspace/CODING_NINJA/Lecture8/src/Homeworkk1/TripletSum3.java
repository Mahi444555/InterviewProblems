package Homeworkk1;
import java.util.Scanner;
public class TripletSum3 {

	  
    public static int findTriplet(int arr[], int x) {
    	
      int count=0;
      int n=arr.length;
        
         for(int i=0;i<=n-1;i++)
         {
           for(int j=i+1;j<n;j++)
             { 
               for(int k=j+1;k<n;k++)
                 {
                    if(arr[i]+arr[j]+arr[k]== x)
                         {
                             count ++;
                         }
                 }
             }
         } 
        
       return count;
	
    }
	
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			
			int q=1;
			
			while(q<=t) {
				
				int n=sc.nextInt();
				int arr[]=new int[n];		//my_array and passing array of size n
				for(int i=0;i<=n-1;i++)
				{
					
					arr[i]=sc.nextInt();
					
				}
				 
				int x=sc.nextInt();		//x is no which we want to matched pair sum 
				
				 int result =  findTriplet(arr,x);		//calling function findTriplet 
				 System.out.println(result);
				q++;
			}	
	}

}
