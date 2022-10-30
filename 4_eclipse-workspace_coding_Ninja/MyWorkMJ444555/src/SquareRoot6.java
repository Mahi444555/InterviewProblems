import java.util.Scanner;
public class SquareRoot6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double p= Math.sqrt(N);
		int round=(int)(p);
		System.out.println(round);
	}

}
