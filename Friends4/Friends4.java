import java.util.Scanner;

public class Friends4 {


	public static void main(String[] args) {
	
	String[] friends;
	friends = new String[4]; 
	Scanner input = new Scanner(System.in);
	String mes = "Please enter the names of your 4 best friends :";
	printMess(mes);
	for (int i=0;i<4;i++){
		printMess((i+1)+". : ");
		friends[i] = input.next();
		}
	printMess("Your friends are: ");
	printFriends(friends);
	}






	public static void printMess(String mes) {
	System.out.println(mes);
	}






	public static void printFriends(String[] friends) {

	for(int i=0;i<friends.length;i++){
		String mes = friends[i];
		printMess(mes);
		
		}
	}

}