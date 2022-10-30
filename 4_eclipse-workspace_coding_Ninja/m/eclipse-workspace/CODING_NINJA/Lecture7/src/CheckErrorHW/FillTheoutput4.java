package CheckErrorHW;

public class FillTheoutput4 {

	public static int func(int n){
	    n += 10; 
	    
	  //  System.out.println(n);
	    return n;
	   
	}
	
	public static void main(String[] args) {

		 int a = 5;
	//int c=	    func(a);		//here function returns value of a in a  firslty function calling then func will reutn
									//will return value of a and we storing that in c and printing c 
		   
		 	func(a);   					//here not storing any value of which return by function  as above hence it
		    System.out.println(a);			// will print local value of a =5
	}

}
