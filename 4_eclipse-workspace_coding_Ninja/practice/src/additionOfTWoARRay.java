import java.util.Scanner;
public class additionOfTWoARRay {

	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
		 int sum=0;
		 int rev=0;
    for(int i=0;i<arr1.length;i++)
    	{
    	//int rev=0;
       
        	if(arr1[i]>0)
            {
               int rem=arr1[i]%10;
                rev=(rev*10)+rem;
                sum=sum+rev;
                
            }
          	
    	}
    	System.out.print(sum);
      /*  for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>0)
            {
               int rem=arr2[i]%10;	//gives remainder
                rev=(rev*10)+rem;
                sum=sum=rev;
            }
        }
      //  System.out.print(sum);*/
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			
		}
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int size;
		if(n1>n2)
		{
			 size=n1+1;
		}
		else {
			 size=n2+1;
			}
		int output[]=new int[size];
		sumOfTwoArrays(arr1,arr2,output);	//calling function
	}

}
