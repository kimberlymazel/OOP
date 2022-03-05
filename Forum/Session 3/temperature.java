/*
Develop a Java program that reads a temperature value in Celsius degrees from the keyboard
and transforms it to Fahrenheit degrees. The program must print the two values in the form:
X Celsius degrees are Y Fahrenheit degrees.

Remember: (F-32)/9 = C/5
*/

import java.util.Scanner; // importing the scanner class for accepting keyboard input

public class temperature {
    public static void main(String[] arg){
        Scanner temp = new Scanner(System.in); // scanner object that takes the temp as input
        System.out.print("Please enter the degrees in Celsius: ");
        
        double ctemp = temp.nextDouble();
        double ftemp = ((ctemp*1.8) + 32); // formula for celsius to fahrenheit
        
        System.out.println(String.format("%.2f", ctemp) + " Celsius degrees are " + String.format("%.2f", ftemp)+ " Fahrenheit degrees.");
        // String.format for 2 decimal place so the result isn't too long
        // Example: 10.5 celsius --> 50.99999... fahrenheit so String.format is used to shorten those situations

        temp.close(); // closes scanner so no input/output stream is opened 
    }
}
