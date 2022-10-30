package lecture1;
import java.util.Scanner;
public class average1 {

	public static void main(String[] args) {
		

//		Scanner sc=new Scanner(System.in);
//		char c=sc.next().charAt(0);
//		int m1=sc.nextInt();
//		int m2=sc.nextInt();
//		int m3=sc.nextInt();
//		System.out.println("Average of three numbers");
//		int avg= (m1+m2+m3)/3;
//		System.out.println(c);
//		System.out.println(avg);
//		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		char c=str.charAt(0);
		

		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int avg=(m1+m2+m3)/3;
		
		System.out.println(c);
		System.out.println(avg);
	}

}
