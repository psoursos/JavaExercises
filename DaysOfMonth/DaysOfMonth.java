import java.util.Scanner;

public class DaysOfMonth {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a month : ");
	String month = input.next();

	switch(month){
	
	case "December":
	case "April":
	case "June":
	case "August":
	case "October":
	System.out.println(month+ ", has 30 days");
	break;
	case "January":
	case "March":
	case "May":
	case "July":
	case "September":
	case "November":
	System.out.println(month+ ", has 31 days");
	break;
	case "February":
	System.out.println(month+ ", has 28 days");
	break;
	default:
	System.out.println("You didn't enter month");
	}
	}

}
