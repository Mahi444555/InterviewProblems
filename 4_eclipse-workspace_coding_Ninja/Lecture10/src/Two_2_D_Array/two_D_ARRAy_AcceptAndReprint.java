package Two_2_D_Array;
import java.util.Scanner;
public class two_D_ARRAy_AcceptAndReprint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int row=sc.nextInt();
		System.out.println("enter the no of col");
		int col=sc.nextInt();
		
		int Input[][]=new int[row][col];	//my 2d array passing rows and columns as sizes
			
		//here accepting the array elements and storing in array i,jth location
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				System.out.println("Enter element at "+i+" row "+j+" column ");
				Input[i][j]=sc.nextInt();	//taking array elements of index at i row and j col
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(Input[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
