import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number (1-7): ");
	int number = Integer.parseInt(input.next());
	String day = returnDay(number);
	System.out.println(day);
	}


	public static String returnDay(int num) {
	
	switch (num) {
	case 1:
    		return("Monday");
  	case 2:
  		return("Tuesday");
  	case 3:
    		return("Wednesday");
  	case 4:
    		return("Thursday");
  	case 5:
    		return("Friday");
  	case 6:
    		return("Saturday");
  	case 7:
    		return("Sunday");
	default:
		return("Error");
    		
		}
	}
} 
	