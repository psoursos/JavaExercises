import java.util.Scanner;
import java.util.ArrayList;

public class CalculateAges {

	public static void main(String[] args) {
                Scanner user_input = new Scanner(System.in);
		askQuestionsAndCalculateBirthYear(user_input);
		
	}
	
	public static void askQuestionsAndCalculateBirthYear(Scanner user_input) {
		
		// Create an ArrayList to hold the years users were born
		ArrayList<Short> yBorn = new ArrayList<Short>();
		ArrayList<Byte> age1960 = new ArrayList<Byte>(); 
		ArrayList<Byte> age2040 = new ArrayList<Byte>();  	

		Short q1 = question1("What is the current year? :", user_input);
		Byte q2 = question2("What is your age? :", user_input);
		Byte q3 = question3("What is the age of person 1?:", user_input);
		Byte q4 = question3("What is the age of person 2?:", user_input);
		Byte q5 = question3("What is the age of person 3?:", user_input);
		calculateBirthYear(q1,q2,yBorn);
		calculateBirthYear(q1,q3,yBorn);
		calculateBirthYear(q1,q4,yBorn);
		calculateBirthYear(q1,q5,yBorn);
		for (byte i=0;i<4;i++) {
		calculateAges1960(yBorn, age1960,i);
		calculateAges2040(yBorn, age2040,i);
                }
                byte z=0;
		printResultUser(yBorn, age1960, age2040,z);
		for (byte i=1; i<4; i++) {
			printResultUserX(yBorn,age1960,age2040,i);
		}
		
	}


	// What is the current year?
        public static Short question1(String message, Scanner uinput) {
    		String answer = makeAQuestion(message,uinput);
		Short year = Short.parseShort(answer);
    		return(year);
    }

	// What is your age?
        public static Byte question2(String message, Scanner uinput) {
    		String answer = makeAQuestion(message,uinput);
		Byte age = Byte.parseByte(answer);
    		return(age);
    }

	// What is the age of person x?
        public static Byte question3(String message, Scanner uinput) {
    		String answer = makeAQuestion(message,uinput);
		Byte age = Byte.parseByte(answer);
    		return(age);
    }

        // question template   
    	public static String makeAQuestion(String message, Scanner user_input){
        	System.out.println(message);
        	String uInput = user_input.next();
        	return(uInput );
    }
	//calculate birth year
	public static ArrayList<Short> calculateBirthYear(Short currYear, byte age, ArrayList<Short> yBorn) {
                short nage = (short)(currYear - age);
		yBorn.add(nage);
		return(yBorn);
		
}
	public static ArrayList<Byte> calculateAges1960(ArrayList<Short> yBorn, ArrayList<Byte> age1960 ,byte i) {
	
        Short born = yBorn.get(i);
        short y =1960;
	byte age =  (byte) (y - born);
	if (age < 0)
		age = -1;
	
	age1960.add(age);
	return(age1960);
	
}
	public static ArrayList<Byte> calculateAges2040(ArrayList<Short> yBorn, ArrayList<Byte> age2040 , byte i) {

	Short born = yBorn.get(i);
        short y =2040;
	byte age =  (byte) (y - born);
	
	age2040.add(age);
	return(age2040);
	
}
	public static void printResultUser(ArrayList<Short> yBorn, ArrayList<Byte> age1960,ArrayList<Byte> age2040,Byte i) {
	
	if (age1960.get(i) < 0) {
		System.out.println("You were born in "+yBorn.get(i) +". In 1960 you were not born and you will be "+age2040.get(i)+ " years old in 2040.");
	} else
	System.out.println("You were born in "+yBorn.get(i) +". In 1960 you were "+age1960.get(i)+" and you will be "+age2040.get(i)+ " years old in 2040.");


}

	public static void printResultUserX(ArrayList<Short> yBorn, ArrayList<Byte> age1960,ArrayList<Byte> age2040,Byte i) {
	
	if (age1960.get(i) <0) {
		System.out.println("Person "+i+" was born in "+yBorn.get(i) +". In 1960 was not born and will be "+age2040.get(i)+ " years old in 2040.");
	} else
	System.out.println("Person "+i+" was born in "+yBorn.get(i) +". In 1960 was "+age1960.get(i)+" and  will be "+age2040.get(i)+ " years old in 2040.");

	}
}