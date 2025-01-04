//--------------------------------------------------------------------------------------------------------------------------
//Student Name: Aman Murshed
//Course: CIT 44
//Term/Year: Fall 2024
//Date: 10/1/2024
//Project Number: 2
//--------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
        System.out.println("Welcome to my app\n");
        System.out.println("Dice Roller\n");

        Scanner rollDice = new Scanner(System.in);

        String continueProgram = getUserChoice(rollDice, "Roll the Dice? (y/n): ");


            while (continueProgram.equalsIgnoreCase("y")) {

                    int die1 = rollDie();
                    int die2 = rollDie();

                    int total = die1 + die2;


                    printDice(die1, die2);
                    printSpecialMessage(total);

                continueProgram = getUserChoice(rollDice, "Roll again? (y/n): ");
                }


            System.out.println("Thank you for using my app");
            rollDice.close();
            }
// This will be the code for the random dice generator
            private static int rollDie(){
            return (int) (Math.random() * 6) + 1;
            }

            private static void printDice(int x, int y) {
                System.out.println("Die 1: " + x);
                System.out.println("Die 2: " + y);
                System.out.println("Total: " + (x+y));
            }
//this prints the special message fo snake eyes and box cars
            private static void printSpecialMessage(int q){
            if(q == 2){
                System.out.println("Snake Eyes!");
            }
            else if(q == 12){
                System.out.println("Box Cars!");
            }

            }

            private static String getUserChoice(Scanner rollDice, String prompt) {
            System.out.println(prompt);
            return rollDice.next();
            }

    }


