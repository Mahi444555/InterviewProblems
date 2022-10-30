package if_else;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int bs=scan.nextInt();					//bs=basic salary taking from System.
		String str=scan.next();		//these String use for taking single character only...
		char c=str.charAt(0);		//using string varibale i.e. str we taking only 0th character...
		int all;
		if(c==65)		//where we are checking 65 is ascii value of A is Grade A if yes then allowance=1700
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;		//allowance
		
		}
		else
		{
			all=1300;		//these else part only execute when above all conditons are flase..
		}
		
		double ts=(bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs);
		double p= Math.round(ts);						/*here these double value converting decimal into nearest
																integer value Math.round use to make number in 
																nearest round value..eg 100.6=101 or 1.1=1.0*/
		int h=(int)(p);		//and here these round value we converting into integer i.e. explicite type cast..
		System.out.println(h);
		
	}

}
