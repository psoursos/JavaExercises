public class ExpressionResult {

	public static void main(String[] args) {

	int x = 1;
	int result ;
	result = -x + x++ - --x + x ;
	System.out.println("Resuly is : "+result+".");
	System.out.println("Because -x = -1, + ,x++=1,-,--x=1, +, 1");
	}

	
}