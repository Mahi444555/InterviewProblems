import java.util.Scanner;
public class DecimalToBinary5 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int rem,sum=0,mul=1; 	//where i iteration till N and sum storing calculations mul is nothing but multiplying eachno
		
		while(N>0)
		{
			rem=N%2;		//now we are converting decimal to binary hence divide by 2 any no to binary then divide by 2
			sum=sum+rem*mul;	//calculation to convert decimal to binary 
			N=N/2;		//here also divide by 2 not by 10 because now its converting into binary bse 2 system 
			mul=mul*10;		//but here now multiplying by 10 because we converting decimal i.e. bse 10 system to 2
		}
		System.out.println(sum);
	}

}
