//program for 2D array and jagged array 3
import java.util.Scanner;
public class jagged_Array_Last {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][3];	//my 2D array where new is keyword that allocates the memory to us
		
		System.out.println(arr[0]+"these is address of 0th row or in master array ie. colm & it's 1D");
		System.out.println(arr[1]+"these is address of 1st row or in master array & its 1D");
		System.out.println(arr[2]+"these is address of 2nd row or in master array & its 1D");
		System.out.println(arr+"these is address of master array which start form [[");
		
		
		int arr2[][]=new int[3][]; 	//here we are only passing no of rows i.e. 1s square bracket 
									//it will only show then master array address 
		System.out.println(arr2+"master array");
		System.out.println(arr2[0]+"\t"+"here printing 0th row address");
		//when we only pass in 2d array only one size i.e no of rows then it will only mastser array
		//if we want to print 1d array in that master array i.e. 0row/1st-row etc then it will gives null
		System.out.println(arr2[1]+" ");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);	//print only null because master array having 4 rows but no columns 
		}
		
		
//form here Jagged array which is nothing but we have no of rows i.e. [4]these is 1st bracket size
//but each row i.e. 1D array has different sizes as below
		int Arr_2[][]=new int[4][];//here we not passed no of column sizes 
		for(int i=0;i<Arr_2.length;i++)
		{
			Arr_2[i]=new int[i+1];	//here giving sizes to each row i.e. i'th row 
		}
		
		for(int i=0;i<Arr_2.length;i++) {		//here printing masters array in which each sub array lenth
			for(int j=0;j<Arr_2[i].length;j++) { //or by default they stored 0
				System.out.print(Arr_2[i][j]+" ");
				
			}System.out.println();
		}
		
		
	}

}
