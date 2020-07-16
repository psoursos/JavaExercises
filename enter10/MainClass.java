/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enter10;

import java.util.Scanner;

/**
 *
 * @author petros
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int number = enter1Το10(input);
        System.out.println("You entered number :" + number + " !");

    }

    public static int enter1Το10(Scanner input) {
        int number = 0;
        do {

            System.out.println("Please enter a number 1-10: ");

            if (input.hasNextInt()) {
                number = input.nextInt();
            } else {
                input.next();
                //System.out.println("Please enter a number 1-10");
            }

        } while ((number > 10 || number < 1));
        return number;
    }
}
