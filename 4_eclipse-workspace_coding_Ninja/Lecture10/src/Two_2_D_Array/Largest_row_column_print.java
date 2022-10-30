//program for find who is largest row or column and print according to that...
package Two_2_D_Array;
import java.util.Scanner;
public class Largest_row_column_print {

	
	public static void largestsum(int arr[][]) {//my function 
		int row=arr.length;
		int col=arr[0].length;	
		
	
		
		
		int max_row=Integer.MIN_VALUE;
		int max_col=Integer.MIN_VALUE;
		int index=0;
		int index_col=0;
		
		
		if(row==0)
		{			
			return;
		}
		else {
			
		int cols=arr[0].length;
		for(int i=0;i<row;i++)
		{
			int sum_row=0;
			for(int j=0;j<col;j++)
			{						
				sum_row=sum_row+arr[i][j];	
			}
			if(sum_row>max_row)
				{	
					max_row=sum_row;
					index=i;
				}
		}
		System.out.println("maximum row is "+max_row+" "+index);

	
		for(int i=0;i<col;i++)
		{
			int sum_col=0;
			for(int j=0;j<row;j++)  
			{						
				sum_col=sum_col+arr[j][i];	
			}
			if(sum_col>max_col)
				{	
					max_col=sum_col;
					index_col=i;
				}
		}
		
		
		System.out.println("maximum column is "+max_col+" "+index_col);
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		if(max_row>=max_col) {
			System.out.println("row"+" "+index+" "+max_row);
		}
		else {
			System.out.println("column"+" "+index_col+" "+max_col);
		}
	}
}
	
	
	
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		System.out.println("enter no of column");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];	//my 2-D array declaring 
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("enter elemnent at " +i+ " row " +j+ " column ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		largestsum(arr);
	}

}
