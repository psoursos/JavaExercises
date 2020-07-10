public class AnnualSalary {

	public static void main(String[] args) {

	short monthlySalary = 900;
	int annualSalary =0;
	float tax = 0.09F;
	float finalSalary = 0.0F;
	float governmentTax =0.0F;

	annualSalary = 12 * monthlySalary;
	governmentTax = annualSalary * tax;
	finalSalary = annualSalary - governmentTax;
	System.out.println("Your annual salary is : "+ annualSalary +" $.Government holds : " + governmentTax +" $ for taxes and you get the remaining :"+finalSalary+" $.");
	} 
}