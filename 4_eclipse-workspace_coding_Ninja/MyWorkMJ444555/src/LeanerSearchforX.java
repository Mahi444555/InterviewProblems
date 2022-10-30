import java.util.Scanner;		//header files 
public class LeanerSearchforX {
	
	public static int[] takeInput( int a[]) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
     	return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int i;
		boolean flag=false;
		int arr[]=new int[n];		
		
			//takeInput(arr);	
		
			for( i=0;i<=n-1;i++)
			{
				
				arr[i]=sc.nextInt();  //accepting array elements and storing in array index10 20 30 40 50  
			}
			
			
		for( i=0;i<=n-1;i++)
		{
			if(arr[i]==x)
			{
				System.out.print("matched and index at:"+i);
				flag=true;		
				break;			
			}
		}
		if(flag == false)	
		{																	
			System.out.println("not matched the number"+x);
		}

	}

}
