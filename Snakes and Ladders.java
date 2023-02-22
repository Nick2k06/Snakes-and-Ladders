/* 
Nickolas Gabrialovitch & Harsher Khaira
ICS3U1
Wednesday December 14 2022
Unit assignment
*/

import java.util.Random;
import java.util.Scanner;

public class MyProgram 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        
    //Creation of Scanner object called "s"
    Scanner s = new Scanner (System.in);
    
        //Introductory message
        System.out.println("Welcome to snakes and ladders, You're on square 1! 🎲");
        
        //Getting the users input
        System.out.print("Would you like to Play?: ");
        String response = s.nextLine();
        
        //Creating an if statement that determines what happens depending on the users input
        if (response.equalsIgnoreCase("Yes")) {
            
        int position = 1; // The player starts at square 1
            while (position < 100) 
            {
                //Creating the dice variables
                int dice1 = rand.nextInt(6) + 1;
                int dice2 = rand.nextInt(6) + 1;
                int total = dice1 + dice2;
                    System.out.println("You rolled a " + dice1 + " and a " + dice2 + " for a total of " + total);
        
                    //Update the player's position
                    position += total;
        
                    // Check if the player landed on a snake or ladder
                    //Ladder
                    if (position == 9) {
                        System.out.println("You landed on a ladder!😎 Climb up to square 34.");
                        position = 34;
                    }
                    //Ladder
                    if (position == 40) {
                        System.out.println("You landed on a ladder!😎 Climb up to square 64.");
                        position = 64;
                    }    
                    // Ladder
                    if (position == 67) {
                        System.out.println("You landed on a ladder!😎 Climb up to square 86.");
                        position = 86;
                    } 
                    //Snake
                    else if (position == 54) {
                        System.out.println("Oh no!😰 You landed on a snake! Slide down to square 19.");
                        position = 19;
                    } 
                    //Snake
                    else if (position == 90) {
                        System.out.println("Oh no!😰 You landed on a snake! Slide down to square 48.");
                        position = 48;
                    } 
                    //Snake
                    else if (position == 99) {
                        System.out.println("Oh no!😰 You landed on a snake! Slide down to square 77.");
                        position = 77;
                    }
                    if (position < 100) {
                        System.out.println("You are now on square " + position);
                    }
                    if (position >= 100){
                        break;
                    }
            }
            System.out.println("Congratulations! You reached square 100 and won the game!😁");
    
        }    else {
            System.out.println("Ok...🤷️");
            }
    }
}