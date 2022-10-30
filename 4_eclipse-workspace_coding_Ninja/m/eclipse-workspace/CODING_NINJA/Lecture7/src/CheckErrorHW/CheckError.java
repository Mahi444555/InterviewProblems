package CheckErrorHW;
import java.util.Scanner;
public class CheckError {

	public static void func(int a) {//these is my function always start from public static and void=datatype,
										//func = Function_name, (int a)= passing argument or value 
		int b=a;
		b=b+10;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=10;
		func(a);
		
		System.out.println(b);			//here we accessing b out of loop and print in main which is not possible 
										//hence comes error if we declare b in main then it possible or access in 
													//out of loop....
		
		
	}

}

//o/p= error   b cannot be resolved to varibale..
