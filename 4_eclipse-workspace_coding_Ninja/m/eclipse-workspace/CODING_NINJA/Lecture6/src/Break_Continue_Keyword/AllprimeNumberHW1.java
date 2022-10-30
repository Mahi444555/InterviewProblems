package Break_Continue_Keyword;
import java.util.Scanner;
public class AllprimeNumberHW1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,newno;	//where newno=number between series which we divide and print
        
        for(newno=2;newno<=n;newno++)	//from 2 to that number we are checking prime or not
        {		
            
            for(i=2;i<=newno-1;i++)
            {
                if(newno%i==0)
                    break;  
            }
            if(i==newno)
                    System.out.println(i);
		
        }
		
	}

}
