//program for Linear_Search_Algorithm i.e. search a number 'x' using linear search
import java.util.Scanner;
public class Linear_Search_Algorithm1 {
	public static int linearSearch(int arr[],int x) {
		int n=arr.length;
		for(int j=0;j<=n-1;j++) {	
			if(arr[j]==x)		
			{
				return j;	
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int q=1;
	while(q<=t)		
	{
	int N=sc.nextInt();
	int arr[]=new int[N];	
	for(int i=0;i<=N-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
		int x=sc.nextInt();
		int result=linearSearch(arr,x);		
		System.out.println(result);
		q++;
	}
	
  }
}
