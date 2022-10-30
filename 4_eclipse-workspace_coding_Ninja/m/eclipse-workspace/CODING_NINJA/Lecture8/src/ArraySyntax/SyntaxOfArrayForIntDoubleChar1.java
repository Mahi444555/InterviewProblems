package ArraySyntax;

public class SyntaxOfArrayForIntDoubleChar1 {

	public static void main(String[] args) {
		
		int n=10;
		int arr[]=new int[n];		//my array declaration for integer 
		
		System.out.println(arr[0]);
		System.out.println(arr[5]);		//here im accessing array elements and printing but not stored any value in 
										//in that hence integer array by defualtly stores 0 
		 
		 
		char chArray[]=new char[10];		//my array declaration for character where array_name=chArray having size10
		chArray[0]='a';
		System.out.println(chArray[0]);
		
		
		double d[]=new double[10];
		d[4]=40.0;		//storing 40 in array d[4] at index location 4
		System.out.println(d[4]);		//here just printing that 		
		
		
		float fArray[]=new float[20];		//datatype=float, array_name=fArray[], new= keyword which allocates memory
											// for us to store now float datatype values having size [20]
		fArray[3]=30;						//here string in 30 in array index 3 of array fArray
		System.out.println(fArray[3]);
	}

}
