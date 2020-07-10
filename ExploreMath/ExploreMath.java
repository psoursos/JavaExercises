import java.lang.Math;

public class ExploreMath {

	public static void main(String[] args) {

	double num = Double.parseDouble(args[0]);
	System.out.println("Math.ceil("+num+") = "+Math.ceil(num));
	System.out.println("Math.floor("+num+") = "+Math.floor(num));
	System.out.println("Math.round("+num+") = "+Math.round(num));
	System.out.println("Math.abs("+num+") = "+Math.abs(num));
	}
}