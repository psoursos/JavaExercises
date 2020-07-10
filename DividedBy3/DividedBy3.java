public class DividedBy3 {

	public static void main(String[] args) {
	
	double result = Double.parseDouble(args[0]) % 3;
	if (result == 0.0) {
		System.out.println(args[0]+" is divided by 3");
	} else {
		System.out.println(args[0]+ " is not divided by 3");
	}
	}
}