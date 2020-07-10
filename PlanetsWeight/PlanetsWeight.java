import java.util.Scanner;
import java.util.ArrayList;
public class PlanetsWeight {

	public static void main(String[] args) {
	

	  
	String planet="";
	String str="";
	Scanner input = new Scanner(System.in);
	String[] planets = {"Venus","Mars","Jupiter","Saturn","Uranus","Neptune"};
	double[] rg = { 0.78,0.39,2.65,1.17,1.05,1.23}; 
	System.out.println("Please enter your weight on Earth: ");
	float weight = Float.parseFloat(input.next());
	System.out.println("Please enter the name of one of the following planets: ");

	for(int i=0;i<planets.length;i++) {
		System.out.println((i+1)+"."+planets[i]);
		}
	planet = input.next();

	for(int i=0;i<planets.length;i++) {
		if (planets[i].equals(planet)){
		str = String.format("%.02f", (weight * rg[i]));
		System.out.println("Your weight is "+str+" kg on planet "+planets[i]+".");}
		}

	

}
}