import java.util.Scanner;
///  char ''    ////
///  String "" /////
public class Grades {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println("Enter a grade : ");
	char grade = input.next().charAt(0);

	switch(grade ){
	
	case 'A':
	System.out.println("Perfect");
	break;
	case 'B':
	System.out.println("Good");
	break;
	case 'C':
	case 'D':
	System.out.println("Pass");
	break;
	default:
	System.out.println("Fail");
	}
	}

}