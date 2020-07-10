import java.util.Scanner;

public class AdultOrChild {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your age: ");
	int age = Integer.parseInt(input.next());

	String mes = age >= 18? "You are an adult!" : "You are a child!"; 
	System.out.println(mes);
	}
}