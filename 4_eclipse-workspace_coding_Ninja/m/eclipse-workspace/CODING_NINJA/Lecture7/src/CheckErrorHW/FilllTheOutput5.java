package CheckErrorHW;
import java.util.Scanner;
public class FilllTheOutput5 {

	public static int square(int a){		//my function name=square and passing (int a) as variable 
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
