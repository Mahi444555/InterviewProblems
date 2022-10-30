package practice;
import java.util.Scanner;
public class pushAllZeroToRight {

	public static void puzhZero(int arr[]) {
		
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<j) {//0<n-1
			int leftIndex=arr[i];
			int rightIndex=arr[j];
			
			if(arr[i]!=0)
			{
				
				i++;
			}
			else if(arr[j]==0)
			{
				j++;
			}
			else if(arr[i]==0 && arr[j]!=0) {
				arr[i]=rightIndex;
				arr[j]=leftIndex;
				i++;
				j--;
			}
			
			
		}
		for(int m=0;i<n;m++)
			System.out.print(arr[m]);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		puzhZero(arr);
		
	}
}
