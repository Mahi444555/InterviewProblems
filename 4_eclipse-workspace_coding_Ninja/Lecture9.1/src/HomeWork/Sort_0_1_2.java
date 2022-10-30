package HomeWork;
import java.util.Scanner;
public class Sort_0_1_2 {

/*	public static void Sort012(int arr[]) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		//int temp[]=new int(n);
	while(i<j) {
		int leftIndex=arr[i];
		int rightIndex=arr[j];
		if(leftIndex==0) 
		{
			i++;
		}
		if(rightIndex==2)
		{
			j--;
		}
		
		if((leftIndex==2) && (rightIndex==0))
		{
			arr[i]=rightIndex;
			arr[j]=leftIndex;
			i++;
			j--;
		}
		if(leftIndex==1 && rightIndex==1)
		{
			
		}
	}
	for( i=0;i<n;i++)
		System.out.print(arr[i]+" ");
}
	*/
	
	public static void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int flag=0;
			for(int j=0;i<n;i++)
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
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
			//Sort012(arr);//calling function and passing array arr
			bubbleSort(arr);
			q++;
		}
	
	}

}
