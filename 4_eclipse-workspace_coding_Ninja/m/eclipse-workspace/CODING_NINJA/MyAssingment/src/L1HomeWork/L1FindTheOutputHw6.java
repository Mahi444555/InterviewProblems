package L1HomeWork;
import java.util.Scanner;
public class L1FindTheOutputHw6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a= 6/4;					/*where 6/4=1 division gives quoitient part only & then we store in 
		 									double i.e. decimal then 1 conver into decimal i.e. 1.0*/
		
		int b=6/4;				//here storing  division gives=quoitient and int/int=int 6/4=1 only.
		double c=a+b;				//both adding double and int and also storing in double= 1.0+1=2.0
		System.out.println(c);

	}

}
