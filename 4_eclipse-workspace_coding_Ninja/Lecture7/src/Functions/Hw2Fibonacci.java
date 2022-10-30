package Functions;
import java.util.Scanner;
public class Hw2Fibonacci {
	public static int square(int a){
	    int ans = a * a;
	    return ans;
	}
	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		  int a = 4;
		    a = square(a);
		    System.out.println(a);
	}

}
