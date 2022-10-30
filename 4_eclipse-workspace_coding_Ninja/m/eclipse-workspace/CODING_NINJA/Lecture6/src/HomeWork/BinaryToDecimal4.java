package HomeWork;
import java.util.Scanner;
public class BinaryToDecimal4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();		//taking as binary number 111 1010 etc
		int rem,sum=0,mul=1;
		
		while(N>0)			//if N=1001
		{
			rem=N%10;	//remainder operator gives last digit or remainder
			sum=sum+rem*mul;	//here 0=0*1*1=1
			N=N/10;				//division gives quetient part i.e. 1001/10=100 only
			mul=mul*2; 				//increasing by 2 or making square of two and then multiply our remainder
			
			
		}
		System.out.println(sum);
	}

}
