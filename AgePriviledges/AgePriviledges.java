import java.util.Scanner;

public class AgePriviledges {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age = Integer.parseInt(input.next());
	String message ="You didn't input age";

	if(age < 16) {
		message = "You can't drive"; 
		
	} else if(age <= 17) {
		message = "You can drive but not vote";
		
	} else if(age <= 21) {
		message = "You can vote but not drink";
	} else {
		message = "You can do anything";
	}
	System.out.println(message);
	}
}