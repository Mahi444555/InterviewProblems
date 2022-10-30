package ArraySyntax;

public class whatIsOutput2 {

	public static void main(String[] args) {
		
		char chArray[]=new char[15];	/*datatype=char array_name=chArray[], =new is the keyword which allocates 
											the memory for us and in these array it will allocates character type of 
											size [15]     */
		System.out.println(chArray[15]);
	}

}
//output=ArrayIndexOutOfBoundsException		array starts form 0 to n-1 then for array size 15 from 0 to 14 only not 15