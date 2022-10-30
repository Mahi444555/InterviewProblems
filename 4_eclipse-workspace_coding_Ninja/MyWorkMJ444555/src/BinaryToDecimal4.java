//for binary to decimal eg 1011 =11 then we have to firstly take each last digite or remainder and multiply it by multip
//multiple of 2 hence take rem, sum=0-which stores our calculation and mul=1 i.e. for multiply each no by 2's multiple


import java.util.Scanner;		//these my header files which stores Scanner
public class BinaryToDecimal4 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int rem, sum=0, squ=1;
		
		while(N>0)
		{
			rem=N%10; 		//its gives remainder or last digit 111 then 111%10=1 only
			sum=sum+rem*squ;		//0+1*1=1  =1+1*2=3  3+1*4=7
			N=N/10;			// its gives queotient part only 1st part 
			squ=squ*2;		//here we making squares or to convert into binary i.e. base 2 system hence multiplying by 2
		}
		System.out.println(sum);
	}

}
