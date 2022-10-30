import java.util.Scanner;
public class SquareRootMethod2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=0,sq=0;
		
		while(i*i<=N) {		//N=4 0*0=0<=4,   1*1<=4,  2*2=4<=4 3*3=9<=4 false
			 sq=i;
			 i++;
		}
		System.out.println(sq);
	}

}
