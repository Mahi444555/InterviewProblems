package Two_2_D_Array;
import java.util.Scanner;//header files for Scanner object
public class Find_Largest_row_columns_sum {

	
	
	public static void print(int Input[][])	//in print funciton passing 2d arry of name Input[][]
	{
		int n=Input.length;	//it will access length of Input array how many rows
		int m=Input[0].length;//it will access in 0th row how many columns are present i.e. columns
		
		for(int i=0;i<n;i++)//it will iterate no of rows
		{
			for(int j=0;j<m;j++)//it will iterate no of columns
			{
				System.out.print(Input[i][j]+" "); 	//here accessing that array elemnts and printing
							//row=0th;  0,0; 0,1; 0,2
							//row=1st;  1,0; 1,0; 1,2
							//row=2nd;  2,0; 2,1; 2,2
			}
			System.out.println();
		}
	}

	public static void largestRowColumn(int Input[][]) {
		
		int n=Input.length;	//gives length of rows i.e.1st size
		int m=Input[0].length;	//gives 0th rows length i.e. no of columns
		
		int Largest=Integer.MIN_VALUE;
		 
		//here making row wise addition and finding which row sum is largest 
		for(int i=0;i<n;i++) 
		{	//row	 0 1 2 
		  int sum=0;
			for(int j=0;j<m;j++)
				{	//row (0,0; 0,1; 0,2) (1,0; 1,1; 1,2) (2,0; 2,1; 2,2)
					
					sum=sum+Input[i][j];
				}
			 if(sum>Largest) 
			 {
				 Largest=sum;
				 System.out.println("Largest row: "+Largest+" "+i+"row");
			 }
		}
		 		 
		//here making column wise addition and finding which column sum is largest 
		//for(int i=0;i<n;i++) 
			for(int j=0;j<m;j++)
		{	//row	 0 1 2 
		  int sum=0;
			//for(int j=0;j<;j++)
		  for(int i=0;i<n;i++)
				{	// (0,0; 0,1; 0,2) (1,0; 1,1; 1,2) (2,0; 2,1; 2,2)
					
					sum=sum+Input[i][j];
				}
			 if(sum>Largest) 
			 {
				 Largest=sum;
				 System.out.println("Largest column: "+Largest+" "+j+"column");
			 }
		}
	}
//	public static void Largestcol
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of rows");
		int row=sc.nextInt();		//these are size one i.e. rows
		
		System.out.println("enter the no. of columns");
		int col=sc.nextInt();		//thes are size two i.e. columns
		
		int Input[][]=new int[row][col];	//my 2-D array_name Input passing two sizes rows/col
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print("element at " +i+ " row " +j+ " column ");
				Input[i][j]=sc.nextInt();	//storing array elements to indexs of 2d array 
											//input0,0; 0,1; 0,2... i.e 0th row and increase columns
				
			}
		}
		print(Input);	//calling function print and passing our 2D array
		largestRowColumn(Input); //calling fucntion LargestRowCoLumn and passing our 2d array INPut
	}

}
