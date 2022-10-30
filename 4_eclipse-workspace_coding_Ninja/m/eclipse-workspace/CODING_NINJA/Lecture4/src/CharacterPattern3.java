import java.util.Scanner;

public class CharacterPattern3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		//int var;
		while(i<=n)
		{
			int j=1;
			int k=65+n-i;
			//char var=((char)('A'+n-i));		//65+5-1=70-1=69 E , 65+5-2=68
			while(j<=i)
			{
				System.out.print((char)(k));
				//var++;
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
