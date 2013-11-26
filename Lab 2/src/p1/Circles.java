package p1;

import java.util.Scanner;
public class Circles { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        final double PI = 3.1415926535897; 
        System.out.println("Please enter a radius");
        int radius1 = scan.nextInt(); 
        double area1 = PI * radius1 * radius1; 
        double circumference1 = 2 * radius1 * PI;
        
        int radius2 = radius1 * 2;
        double area2 = PI * radius2 * radius2; 
        double circumference2 = 2 * radius2 * PI;
        
        double scale1 = area2 / area1;
        double scale2 = circumference2 / circumference1;
        
        System.out.println("The area of a circle with radius " + radius1 + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius1 + " is " + circumference1); 
        
        System.out.println("\nThe area of a circle with radius " + radius2 + " is " + area2); 
        System.out.println("The circumference of a circle with radius " + radius2 + " is " + circumference2); 
        
        System.out.println("\nThe second circle with radius " + radius2 + " has an area that is " + scale1 + " times larger than the first with radius " + radius1); 
        System.out.println("The second circle with radius " + radius2 + " has a circumference that is " + scale2 + " times larger than the first with radius " + radius1); 
        scan.close();
    } 
}