import java.util.Scanner;

public class Scool {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter your age");
	int age = input.nextInt();
	String mes;
	
	if (age > 5 && age < 13) {
		mes = "You are on elementary school.";	
	} else if( age > 12 && age < 16) {
		mes = "You are on middle school.";
	} else if (age > 15 && age < 19) {
		mes = "You are on high school.";
	} else {
		mes = "You are not going to school.";
	}
	
	System.out.println(mes);
	}
}