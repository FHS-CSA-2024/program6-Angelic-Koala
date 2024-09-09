>//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
        final double pi = 3.14159;
        double radius;
        double circumference;
        double diameter;
        double area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        diameter = 2 * radius;
        circumference = pi * diameter;
        area = pi * radius * radius;
        
        System.out.println("The radius of the circle = " + radius);
        System.out.println("The diameter of the circle = " + diameter);
        System.out.println("The area of the circle = " + area);
        System.out.println("The circumference of the circle = " + circumference);
    }
}
//Paste console output below:
/*
Enter the radius: 
3.712
The radius of the circle = 3.712
The diameter of the circle = 7.424
The area of the circle = 43.28779268096
The circumference of the circle = 23.32316416

*/
