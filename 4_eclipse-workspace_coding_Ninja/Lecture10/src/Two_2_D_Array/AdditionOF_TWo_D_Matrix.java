package Two_2_D_Array;
import java.util.Scanner;
public class AdditionOF_TWo_D_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		
		System.out.println("enter no of columns");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];	//declaring array1 and its size passing i,j row and columns
		int arr2[][]=new int[row][col];
		int add[][]=new int[row][col];	//3rd array for storing addition of both array

		System.out.println("accept 1st array elements");
		for(int i=0;i<row;i++)//no of rows
		{
			for(int j=0;j<col;j++)	//no of columns
			{
				arr1[i][j]=sc.nextInt();	//taking arr1 elemnts from System i,j
			}
		}
		
		System.out.println("accept 2nd array elements");
		for(int i=0;i<row;i++)//no of rows
		{
			for(int j=0;j<col;j++)	//no of columns
			{
				arr2[i][j]=sc.nextInt();	//taking arr1 elemnts from System i,j
			}
		}
		System.out.println("Resultant array ");
		for(int i=0;i<row;i++)//no of rows
		{
			for(int j=0;j<col;j++)	//no of columns
			{
				add[i][j]=arr1[i][j]-arr2[i][j];	//taking arr1 elemnts from System i,j
			}
		}
		
		for(int i=0;i<row;i++)//no of rows
		{
			for(int j=0;j<col;j++)	//no of columns
			{
				System.out.print(add[i][j]+" ");//taking arr1 elemnts from System i,j
			}
			System.out.println();
		}
	}

}
