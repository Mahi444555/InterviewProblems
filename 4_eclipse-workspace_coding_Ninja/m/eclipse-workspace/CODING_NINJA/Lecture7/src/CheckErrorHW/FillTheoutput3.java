package CheckErrorHW;

public class FillTheoutput3 {
	public static void doubleValue(int a ){
	    a = a * 2;			//a=8*2=16			but not returning value in main hence these value not print
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int a = 8;
		    doubleValue(a);					//calling function doubleValue and passing value of variable a=8
		    System.out.println(a);		//it will only print local value of a =8
	}

}
