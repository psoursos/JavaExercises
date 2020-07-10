import java.util.Scanner;
public class EveryDay {

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter day");
	String day = input.next();
	switch(day) {

	case "Monday":
	case "Tuesday":
	case "Wednesday":
	case "Thursday":
	case "Friday":
	System.out.println("Go to work");
	break;
	case "Saturday":
	case "Sunday":
	System.out.println("Relaxing");
	break;
	default:
	System.out.println("You didn't enter day!");
	}
	}
}