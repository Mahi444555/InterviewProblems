import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int y=n;
        int z=n;
        int x=1;
        int ans=0;
        int length=0;
        while(n!=0)
        {
            n=n/10;
            length++;
        }
        while(y!=0){
            x=1;
            int count=length;
            int r=y%10;
            
            while(count>0)
            {
                x=x*r;
                count--;
            }
            ans=ans+x;
            y=y/10;
        }
        if(ans==z)
            System.out.println("true");
        else
            System.out.println("false");
	}
	}


