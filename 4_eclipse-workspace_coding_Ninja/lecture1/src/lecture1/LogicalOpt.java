package lecture1;
import java.util.Scanner;
public class LogicalOpt {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();		//taking three inputs from user...
		
		
		boolean i=(a>=b)&&(a>=c);		//a=10 b=20  c=30. is 10>=20 && 10>=30 false...
		boolean j=(a>=b)||(a>=c);			// 10>=20 || 10>=30 flase..
		boolean k=!(a>=b);				// is 10>=20 false but we give negation i.e. opposite... then ture
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

}
