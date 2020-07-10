package myPackage;

public class OperatorsTesting {

	public static void main(String[] args){
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);

	System.out.println("Numbers Entered : " + num1 +", "+ num2 );
	System.out.println(num1+" > "+num2+" = " + (num1 > num2) );
	System.out.println(num1+" < "+num2+" = " + (num1 < num2) );
	System.out.println(num1+" >= "+num2+" = " + (num1 >= num2) );
	System.out.println(num1+" <= "+num2+" = " + (num1 >= num2) );
	System.out.println(num1+" == "+num2+" = " + (num1 == num2) );
	System.out.println(num1+" != "+num2+" = " + (num1 != num2) );
	}
}