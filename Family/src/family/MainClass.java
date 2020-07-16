/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author petros
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        askUser(input);
        System.out.println("How many family members do you want to enter? ");
        byte num = input.nextByte();
        for (byte i = 0; i < num; i++) {
            AskUserForFamilyMembers(input);

        }

    }

    public static void askUser(Scanner input) throws IOException {

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your age");
        byte age = input.nextByte();
        Person user = new Person(name, age);
        System.out.println("Do you have any pets (y/n)?");
        char yn = input.next().charAt(0);
        if (yn == 'y') {
            System.out.println("How many pets do you have?");
            byte num = input.nextByte();
            List<Pet> pets = new ArrayList();
            for (byte i = 0; i < num; i++) {
                System.out.println("Enter nickname of your " + (i + 1) + " pet");
                String nickname = input.next();
                System.out.println("Enteer type of your " + (i + 1) + " pet");
                String type = input.next();
                Pet pet = new Pet(nickname, type);
                pets.add(pet);
            }
            user.setPets(pets);

        }

          // writeTofile();
        String str = user.toString();
        writeWithFileWriter(str);
    }

    public static void AskUserForFamilyMembers(Scanner input) throws IOException {
        System.out.println("Enter Family member's name");
        String name = input.next();
        System.out.println("Enter Family member's age");
        byte age = input.nextByte();
        Person user = new Person(name, age);
        System.out.println("Does he/she have any pets (y/n)?");
        char yn = input.next().charAt(0);
        if (yn == 'y') {
            System.out.println("How many pets does he/she  have?");
            byte num = input.nextByte();
            List<Pet> pets = new ArrayList();
            for (byte i = 0; i < num; i++) {
                System.out.println("Enter nickname of " + (i + 1) + " pet");
                String nickname = input.next();
                System.out.println("Enteer type of  " + (i + 1) + " pet");
                String type = input.next();
                Pet pet = new Pet(nickname, type);
                pets.add(pet);
            }
            user.setPets(pets);

        }

        // writeTofile();
        String str = user.toString();
        writeWithFileWriter(str);
    }

    
        public static void writeWithFileWriter(String str) throws IOException{
        String filename = "C:\\Users\\petros\\Documents\\Family.txt";
        FileWriter filewriter = new FileWriter(filename, true);
        BufferedWriter writer = new BufferedWriter(filewriter);
        writer.write(str);
//        readFileWithBufferedReader(filename);
        writer.close();
        filewriter.close();
    }
}
