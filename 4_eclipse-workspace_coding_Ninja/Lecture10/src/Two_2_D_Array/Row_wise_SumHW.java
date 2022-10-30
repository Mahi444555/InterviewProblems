package Two_2_D_Array;
import java.util.Scanner;
public class Row_wise_SumHW {

	
	
	public static void rowWiseSum(int arr1[][]) {
		int sum=0;
		int n=arr1.length;
		int m=arr1[0].length;
		System.out.println(n);
		System.out.println(m);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
			{
				sum=sum+arr1[i][j];
			}
			System.out.print(sum+" ");
			sum=0;
		}
			
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of test-cases to be run");
		int t=sc.nextInt();
		int q=1;
		while(q<=t) {
			
		//	System.out.print("enter the no of rows/lines=i: ");
			int N=sc.nextInt();
		//	System.out.print("enter the no of columns=j: ");
			int M=sc.nextInt();
			
			int arr1[][]=new int[N][M];
			for(int i=0;i<N;i++) 
			{
				for(int j=0;j<M;j++) 
				{
					//System.out.println("enter array element at "+i+" row " +j+ " colum ");
					arr1[i][j]=sc.nextInt();		//taking values and storing in array matrix
				}
			//	System.out.println();
			}
//			int sum=0;
//			//int output[][]=new int[N][M];
//			for(int i=0;i<M;i++) {
//				for(int j=0;j<N;j++) 	//0,1,2,3,4
//				{
//				  sum=sum+arr1[i][j];	//arr1(0,0);+ (0,1); +(0,2); +(0,3); +(0,4);
//				}
//				System.out.println(sum+" ");
//				sum=0;
//				
//			}
			
			rowWiseSum(arr1);	//calling function and passing array matrix 
			q++;
		}
		
	}

}
