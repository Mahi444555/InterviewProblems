package forLoops;
import java.util.Scanner;
public class NthFibonaciiNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        int a=1,b=0,c = 0;
        int i;
        for(i=1;i<=n;i++)
        {
            c=a+b;		
            //System.out.println(c);
            a=b;		
            b=c;		 
        }
        System.out.print(c);
	}

}
