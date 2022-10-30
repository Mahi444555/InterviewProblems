package HomeWork;
import java.util.Scanner;
public class Sum_of_two_Array {

	
	public static void SumOfArray(int arr1[], int arr2[])
	{
		int n=arr1.length;	//accessing array1 length and assign to n
		int m=arr2.length;	//accessing array2 length and assign to m
		int output[]=new int[(n>m)? n:m];	//tertiory operator condin?case1:case2 
		if(m==0 && n==0) {	//i.e. both array contains no elements then directly exit or return.
			return;
		}
		int i=n-1;	//i is iteration for arr1 we start from n-1 i.e.(Last & decrease till) equl to 0
		int j=m-1;
		int k=output.length-1;
		int carry=0;
		int sum=0;
		while(i>=0 || j>=0 || k>0) {//here we start from last index n-1,then decrease till equl to 0+ 
									//4>0 True; 3>0; 2>0; 1>0; 0>=0 then -1>0 flase
			int fd= (i>=0) ? arr1[i]:0;	//her checking if i(index)is greater thn 0 thn assing that index elemnt value to fd
			int sd= (j>=0) ? arr2[j]:0;	//if jth index is less than 0 thn assign zero to sd 
			
			sum=fd+sd+carry;
			
			int rem=sum%10;		//% gives remainder/last digite
			carry=sum/10;	// / gives 1st digite
			output[k]=rem;
			
			if(i>=0)
				i--;
			if(j>=0)
				j--;
			k--;

		}
		for(int I=0;I<n;I++)
		{
			System.out.print(output[I]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];	//1st array
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();	//taking 1st array elements
		}
		int n2=sc.nextInt();
		int arr2[]=new int[n2];	//new is the keyword that allocates the memory for us 
		for(int j=0;j<n;j++)
		{
			arr2[j]=sc.nextInt();	//taking 2nd array elements
		}
		SumOfArray(arr1,arr2);	//calling the function and passing values i.e. array's 
	}
}
