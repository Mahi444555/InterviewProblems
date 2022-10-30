import java.util.Scanner;
public class AlphaPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int i=1;
        
        while(i<=n)
        {
            int j=1;
            int k=i;
            while(j<=i)
            {
                System.out.print((char)(k+64));
                k++;
                j++;
            }
            System.out.println();
            i++;
        }
	}

}
