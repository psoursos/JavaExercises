public class Seconds {

	public static void main(String[] args) {

	long input = Long.parseLong(args[0]);
	int hours = (int)(input / 3600);
	int remainder = (int)(input - hours * 3600);
	int minutes = remainder / 60;
	remainder = remainder - minutes * 60;
	int seconds = remainder;

	System.out.println(input+" seconds are "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds.");
	}
}