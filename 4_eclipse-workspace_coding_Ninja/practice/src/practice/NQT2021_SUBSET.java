package practice;
import java.util.Scanner;
public class NQT2021_SUBSET {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];	//my array of size num
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int num2=sc.nextInt();	//num2 is no which we have to find in subset present or not
		int s=sc.nextInt();		//its a size of subset
		
		boolean found=false;
		
		for(int i=0;i<num;i+=s) {
			
			found=false;
			for(int j=i;j<i+s && j<num;j++) {
				
				if(arr[j]==num2)
					found=true;
			}
			if(found==true)
				continue;
			else
			{
				System.out.print("0");
				return;
			}
		}
		System.out.print("1");
	}

}
