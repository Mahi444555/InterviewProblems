//program for find avg and of three numbers before that accept single chart then print avg..

package L1HomeWork;
import java.util.Scanner;		//header file in which Scanner function is already predifine...
public class L1AverageHw5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=str.charAt(0);		//charAt(0)=means read only 0th character in string as we take support sting..
		//char c=sc.next().charAt(0);
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int avg=(m1+m2+m3)/3;
		System.out.println(c);		//printing single character
		System.out.println(avg);
		

	}

}
