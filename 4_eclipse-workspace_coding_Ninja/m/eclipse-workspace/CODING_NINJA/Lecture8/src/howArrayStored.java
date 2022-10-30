import java.util.Scanner;
public class howArrayStored {

	
	public static void print(int input[]) {
		
		for(int i=0;i<=input.length-1;i++)
		{
			System.out.print(input[i]);
		}
	}
	
	public static void incrementArray(int input[]) {	//here passing array input[] is repalced with arr[]
		
		input =new int[5];
		for(int i=0;i<=input.length-1;i++)
		{
			int d=input[i]++;
		
		}
	
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		incrementArray(arr);
		
		print(arr);  //calling print function and passing arr which stored now increment 
	}

}
