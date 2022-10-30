import java.util.Scanner;

public class SortZeroANDone {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];		
		for(int m=0;m<=N-1;m++)
		{
			arr[m]=sc.nextInt();
		}
		int i=0;		
		int j=N-1;		
		while(i<j)		
		{
			int leftIndex=arr[i];		
			int rightIndex=arr[j];		
			if(leftIndex==0 && rightIndex==1)
			{
				i++;
				j--;
			}

			if(leftIndex == 1 && rightIndex == 0)
				{
					arr[i]=rightIndex;
					arr[j]=leftIndex;
					i++;
					j--;
				}
		}
		
		for(int k=0; k<N;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}

}
