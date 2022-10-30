package HomeWork;
import java.util.Scanner;
public class SuqreRootintegral6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
	/*	double m= Math.sqrt(N);
		int round= (int)m;
		System.out.println(round);
	*/
		
		int i,sq=0;
		for(i=0;i*i<=N;i++) //0*0=0<=18; True; 1*1=1<=18; T;  2*2=4<=18; 3*3=9<=18; T; 4*4=16<=18; T; 5*5=25<=18 F 
		{
			sq=i;			//  sq=0, i=1; sq=1, i=2; sq=2, i=3; sq=3; i=4, sq=4, i=5;
		}
		System.out.println(sq);		//here printing last value of i storing in sq 
		
		
	}

}
