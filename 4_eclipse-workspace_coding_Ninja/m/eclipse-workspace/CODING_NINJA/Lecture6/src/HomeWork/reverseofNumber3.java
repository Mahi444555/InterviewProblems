package HomeWork;
import java.util.Scanner;
public class reverseofNumber3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,rev=0;		//rem=remainder, rev=reverse
        
        while(n>0)
        {
            rem=n%10;		//modulus gives remainder or separate out last digite
           // System.out.print(rem);
            rev=(rev*10)+rem;
            n=n/10;			//division gives quetient  part only first part
            
        }
        System.out.print(rev);
	}

}
