package CheckErrorHW;
import java.util.Scanner;
public class CheckError2 {
		
	public static void func(int a) {
		int b=10;
		a=a+10;				//a=10+10=20
		System.out.println(a);			//print a=20
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=10;
		func(a);		//calling func_function 
		System.out.println(a);		//10 it will only print local variable a's value
	}

}
