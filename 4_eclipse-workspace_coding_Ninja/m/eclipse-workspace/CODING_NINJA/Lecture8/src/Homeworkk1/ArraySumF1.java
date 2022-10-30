package Homeworkk1;
import java.util.Scanner;
public class ArraySumF1 {

	
	
	public static void add(int arr[])
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			 sum=sum+arr[i];		//here just addding that elelemnts
		}
		System.out.println(sum);
	}
	
	
	public static int[] takeInput()
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();		//taking t i.e. no of choices
		//for(int i=1;i<=t;i++)		//taking number still t
		int i=1;
		while(i<=t)
		{
			int N=sc.nextInt();
			int arr[]=new int[N];		//my array of name arr[] passing size as N and new is allocates memory to us
			for(int j=0;j<=N-1;j++)
			{
				arr[j]=sc.nextInt();		//taking array element till N-1 
			}
			i++;
			return arr;
		}
		return null;
			
	}
	
	
	public static void main(String[] args) {
		
		
		
		int m[]=takeInput();
			add(m);			//calling add function in which m is stored array elemnts and gives
	}

}
