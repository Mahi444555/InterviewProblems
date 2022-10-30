package CheckErrorHW;

public class passByValue {

	public static void increase(int x,	int y){
					x++;
					System.out.println(x);
						y =	y +	2;
						System.out.println(	":" +	y);
	}
	public static void main(String[] args) {
		int a =	10;
		int b =	20;
		increase(a,b);
		System.out.println(a +	":" +	b);
	}

}
