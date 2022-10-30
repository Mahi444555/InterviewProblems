package if_else;
import java.util.Scanner;
import java.awt.datatransfer.SystemFlavorMap;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);		//declaring sc varibale for taking input form system...
		int n=sc.nextInt();
		int c;
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}

}
