package HomeWork;
import java.util.Scanner;
public class sort012 {
	
	public static void sort012(int arr[]) {
		
		int n=arr.length;
		int count0=0;
		int count1=0;
		int count2=0;
		int pos=0;
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count0++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1) 
			{
				count1++;
			}
		}		

		for(int i=0;i<n;i++)
		{
			if(arr[i]==2)
			{
				count2++;
			}
		}		

		for(int i=0;i<count0;i++)
		{
		 temp[pos]=0;
		 pos++;
		}
		for(int i=0;i<count1;i++) 
		{
			temp[pos]=1;
			pos++;
		}
		for(int i=0;i<count2;i++) 
		{
			temp[pos]=2;
			pos++;
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	//taking array elements till and storing in arry till n-1
		}
		sort012(arr);	//calling function and passing random array....

	}

}
