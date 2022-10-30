
import java.util.Scanner;
public class HW_Spiral_print {

	public static void spiralPrint(int arr[][]) {
		
		int row=arr.length;	//accessing array length gives no of rows present in array
		int col=arr[0].length;//accessing array in that 0th row's length it will gives no of column
		int R=0;
		int C=0;	//R,C will iterates till row and col....
		
		while(R<row && C<col) 
		{
			/*1stly print 0th row then (row,col) 0,0; 0,1;  0,2; 0,3  eg row=4 col=4...	
			 here row will be same but column will change once we printed that then for next row increase 
			 R++	(Left-Right)
			*/	
		for(int i=C;i<col;i++)  //i=0;i<4;i++ only column taking 0 till less than 4
		{
			System.out.print(arr[R][i]+" ");
		}
		R++;	//for next row 
			
			/*2nd we have to print Last column form (top-bottom) here column will same but
			  row will be change i.e (row,col)  last column= 1,3; 2,3; 3,3 but it will not start form
			  0th row and 3rd col (0,3) because it already printed hence start from 1st row*/
		
		for(int i=R;i<row;i++) //i=R i.e last updated value of row assign to i then i=1 till row
		{
			System.out.print(arr[i][col-1]+" ");//(i,col-1) i.e. (1,4-1)=(1,3)
		}
		col--; //here last column will printed then print previous of that then decrease column now
				//col=4-1=3
		
		
		
		
		/*3rd from here we print last row from but from 2nd last column i.e 3,2 not 3,3 it already 
		  printed  here only column will changes it will start from last index till 0 and row will
		  same */
		if(R<row)	//1<4
		
			for(int i=col-1;i>=C;i--) //i=col i.e. last updated value of col=3 then 3-1=2column
			{
				System.out.print(arr[row-1][i]+" ");		
			}
		
		row--;	//now we printed last row then to print previous of that row decrease row--;

	/*now we have to print column but 0th column from bottom to top then only row will changes
	  column will same as it is i.e. 3,0; 2,0; 1,0; not=0,0  it will already printed*/	
		
	if(C<col)

		for(int i=row-1;i>=R;i--)//i=row-1 i.e. 4-1 =3rd row till 3,2,1 not 0th row hence grter thn 0
		{
			System.out.print(arr[i][C]+" ");
		}
		C++;//here column iteration will increase for we have to also print next col 
	
	
     }
}  	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		System.out.println("ente the no of columns");
		int col=sc.nextInt();
		
		int arr[][]=new int[row][col];	//my 2D array of name arr[][]
		
		for(int i=0;i<row;i++)//i iterates till row no
		{
			for(int j=0;j<col;j++)//j iterates till column no
			{
				System.out.print("enter element at row "+i+" col "+j );
				arr[i][j]=sc.nextInt();	//accepting array elements from user and storing in arr location(i,j)
			}			
		}
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		spiralPrint(arr);	//calling our function spiralPrint() and passing 2d array
	}

}
