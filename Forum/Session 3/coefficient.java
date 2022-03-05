/*
Develop a Java program that reads the three coefficients (a, b, c) of a 2nd grade polynomial
(ax^2 + bx + c = 0) and obtains and prints the values of x.

What happens when a is equal to 0?
*/

import java.util.Scanner;

public class coefficient {
    public static void main(String[] args){
        System.out.println("Please enter the values for ax^2 + bx + c = 0");
       
        Scanner value = new Scanner(System.in); // new scanner object to take in values

        // declaring the aval first so it can be used outside the while loo
        
        double aval = 0.0;
        
        // while loop for if a is 0 (doesn't accept)
        while(true){
            System.out.print("a = ");
            aval = value.nextDouble();
            if(aval==0){ // if aval is 0, shows message and while loop continues
                System.out.println("a cannot be 0. Please enter the a value again.");
            }
            else if(aval!=0){ // if aval is not 0, while loop breaks
                break;
            }
        }

        // b value
        System.out.print("b = ");
        double bval = value.nextDouble();

        // c value
        System.out.print("c = ");
        double cval = value.nextDouble();


        // discriminant value (square root of b^2 - 4ac)
        double discriminant = (Math.pow(bval, 2.0) - (4 * aval * cval));

        // if statement to distinguish discriminants
        if (discriminant > 0.0){ // if discriminant > 0, there are 2 roots
            double firstroot = (-bval + Math.pow(discriminant, 0.5)) / (2 * aval);
            double secroot = (-bval - Math.pow(discriminant, 0.5)) / (2 * aval);
            System.out.println("The x values are " + String.format("%.2f", firstroot) + " and " + String.format("%.2f", secroot));
            // used String.format so the values aren't too long (example: -0.437...)
        }
        
        else if (discriminant == 0.0){ // one real solution only
            double realsol = -bval / 2 * aval;
            System.out.println("The x value is " + String.format("%.2f", realsol));
        }

        else { // imaginary roots
            System.out.println("The determinant is less than zero therefore there are no real roots.");
        }

        value.close();
    }
}
