package myPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class Average {

	public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Scanner userInput = new Scanner(System.in);
        
	for(int i=0;i<3;i++) {
		System.out.println("Enter number "+(i+1)+" : ");
		String input = userInput.nextLine();
		numbers.add(Integer.parseInt(input));
		}
	float average = (numbers.get(0)+numbers.get(1)+numbers.get(2))/3;

	System.out.println("The average of "+numbers.get(0)+", "+numbers.get(1)+", "+numbers.get(2)+" is : "+average);
	}
}