package p1;

import java.util.Scanner; 
public class Paint {
    public static void main(String[] args) { 
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal 
        int length; int width; int height;    
        int doors; int windows;                         //declare integers length, width, and height; 
        double totalSqFt;                                                   //declare double totalSqFt; 
        double paintNeeded;                                                 //declare double paintNeeded; 
        Scanner scan = new Scanner(System.in);                              //declare and initialize Scanner object 
        System.out.println("Please enter the length of the room");          //Prompt for and read in the length of the room 
        length = scan.nextInt(); 
        System.out.println("Please enter the width of the room");           //Prompt for and read in the width of the room 
        width = scan.nextInt(); 
        System.out.println("Please enter the height of the room");          //Prompt for and read in the height of the room 
        height = scan.nextInt(); 
        System.out.println("Please enter the number of doors in the room");          //Prompt for and read in the height of the room 
        doors = scan.nextInt() * 20; 
        System.out.println("Please enter the number of windows in the room");          //Prompt for and read in the height of the room 
        windows = scan.nextInt() * 15; 
        totalSqFt = (length * height * 2) + (width * height * 2) - doors - windows;           //Compute the total square feet to be painted--think 
        paintNeeded = totalSqFt / COVERAGE;                                 //about the dimensions of each wall 
        System.out.println("The room is " + 
                length + "ft long, " + 
                width + "ft wide, and " + 
                height + "ft long. You have " + 
                doors / 20 + " doors and " +
                windows / 15 + " Windows. \nYou need " + 
                paintNeeded + " gallons of paint."); //Compute the amount of paint needed 
                                                                            //Print the length, width, and height of the room and the 
                                                                            //number of gallons of paint needed. 
  } 
  } 
