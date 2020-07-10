import java.util.Scanner;
public class Month {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Month ");
	String month = input.next();

	switch(month) {

	case "June":
	case "July":
	case "August":
	System.out.println("It's Summer");
	break;
	case "September":
	case "October":
	case "November":
	System.out.println("It's Autumn");
	break;
	case "December":
	case "January":
	case "February":
	System.out.println("It's Winter");
	break;
	case "March":
	case "April":
	case "May":
	System.out.println("It's Spring");
	break;
	default:
	System.out.println("You didn't enter month");
	}
	}
}