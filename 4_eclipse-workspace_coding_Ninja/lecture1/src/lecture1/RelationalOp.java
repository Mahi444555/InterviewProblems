package lecture1;
import java.util.Scanner;
public class RelationalOp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();			//two inputs taking from user...
		
		//where boolean only gives o/p as true & false 1&0....
		
		boolean E=(a==b);
		boolean f=(a!=b);
		boolean g=(a>b);
		boolean h=(a>=b);
		boolean i=(a<b);
		boolean j=(a<=b);
		
		System.out.println("is Equal: "+E);
		System.out.println("is not Equal: "+f);
		System.out.println("is greater: "+g);
		System.out.println("is greater than Equal to: "+h);
		System.out.println("is less: "+i);
		System.out.println("is less than Equal to: "+j);
		
	}

}
