package codingAssignment2;
/*
Project Title: Compass Coding Assignment - ICS3U Unit 3: Decision Structures
Project Description: This program reads the bearing number entered by the user and tell them what direction it is heading it; North, South, East or West. It will
also recognize if a bearing is directly in the middle of two directions, returning bearing directions such as Northeast, Northwest, Southeast and Southwest.
Name: Suhani Surya
Date: April 11th - 12th, 2023
 */
//Import the scanner
import java.util.Scanner;//This statement imports the scanner class from java utilities package so the program can derive input from the user in the console.

//Class header
public class CodingAssignment2//This is the class header called CodingAssignment2
{
    //Main method header
    public static void main(String[] args)//This is the main method header to tell java that this is a public main
    {
        //Naming the scanner object and declaring which input it receives
        Scanner keyboard = new Scanner(System.in);//This line creates a new scanner class called keyboard which derives output from the console

        int bearing;//This variable is to get the bearing from the user. It is in the integer data type because the bearings are most likely going to be whole numbers, not floating point numbers

        System.out.print("Please enter a bearing between 0 and 359 degrees: ");//This statement asks the user to enter a bearing between 0 and 359 degrees and printing it in the console

        bearing = keyboard.nextInt();//This line assigns the user input from the console into the bearing variable

        //beginning of decision structure, input validation
        if (bearing >= 0 && bearing <= 359) //If the bearing is above or equal to zero and below or equal to 359
        {

                //NORTH DIRECTION CONDITIONS
            if(bearing < 45)//This condition asks if the bearing is below 45
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading North.");//print the statement that the bearing is heading north
                }
                else if(bearing == 45)//if the above condition is not met, and is equal to 45, the following code will execute
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading North/East.");//print out that the direction is north east since it is directly on the 45 bearing
                }

                //EAST DIRECTION CONDITIONS
                else if(bearing < 135)//if the bearing is less than 135
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading East.");//print the statement in the console that the direction is east. Logical operators within the argument of the if statement was not used because if it had already met the previous conditions, those statements would have been executed on the bearing already
                }
                else if(bearing == 135)//if the bearing is equal to 135
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading South/East.");//print that the direction is south east since it is exactly on the 135 degrees
                }

                //SOUTH DIRECTION CONDITIONS
                else if(bearing < 225)//if the bearing is less than 225
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading South.");//print that the direction is south in the console
                }
                else if(bearing == 225)//if the bearing is equal to 225
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading South/West.");//print that the direction is south west since it is exactly on the 225 degrees bearing
                }

                //WEST DIRECTION CONDITIONS
                else if(bearing < 315)//if the bearing is less than 315
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading West.");//print in the console that the bearing is in a westerly direction
                }
                else if(bearing == 315)//if the bearing is equal to 315
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading North/West.");//print that the direction is north west since it is exactly on 315 degrees
                }

                //BACK TO THE NORTH DIRECTION CONDITION
                else //if all other conditions have not been met(this number would have to be above 315 because of all of the previous conditionals)
                {
                    System.out.println("A bearing of " + bearing + " degrees means you are heading North.");//print in the console that the direction is north
                }

                /*
                NOTE:
                And statements were not used due to the fact that if the condition was met previously, there was no need to add that in the new conditional statement.
                EX: if(bearing >= 0 && bearing < 45) would be redundant because the very first if statement asks if the number is >= 0 already. I used this thinking to make my code more efficient.
                 */

        }
        else //this condition will run if the bearing is less than zero or more than 359
        {
            System.out.println("That is not a valid bearing. Please restart the program and enter a bearing between 0 and 359 degrees.");//give the user an error message that the bearing they entered is invalid.
        }
        keyboard.close();//this statement closes the keyboard so that it does not waste any space in the memory or any ram.
    }
}
