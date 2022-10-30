package String_2D_Array;
import java.util.Scanner;
public class PrintAll_SubstringHW {

	public static void PrintSubstring(String str) {//declaration of function of name PrintSubString()
		
		for(int i=0;i<str.length();i++) {	//outerloop eg="abc" length=3 0<3; 1<3; 2<3; 3<3false...
			
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));//i,j i.e startIndex and EndIndex but rang=end-1
			}
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();	//accepting Sting from System by using Scanner object to read frm user
		PrintSubstring(str);	//calling fucntion and passing string str
		
	}

}
