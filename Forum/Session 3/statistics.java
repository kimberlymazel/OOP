/*
Develop a Java program to calculate the following statistical parameters of
three values read from the keyboard. Print the results.
*/

import java.util.Scanner; // importing the scanner class for accepting keyboard input

public class statistics {
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in); // scanner object for inputted numbers

        // first value
        System.out.print("Please enter the first value: ");
        double first = num.nextDouble();

        // second value
        System.out.print("Please enter the second value: ");
        double second = num.nextDouble();

        // third value
        System.out.print("Please enter the third value: ");
        double third = num.nextDouble();

        // calculations
        double mean = (first + second + third)/3.0;
        double variance = (Math.pow((first - mean), 2) + Math.pow((second - mean), 2) + Math.pow((third - mean), 2))/3.0;
        double sdev = Math.sqrt(variance);

        // printing the values at 2 decimal place
        System.out.println("Mean: " + String.format("%.2f", mean));
        System.out.println("Variance: " + String.format("%.2f", variance));
        System.out.println("Standard Deviation: " + String.format("%.2f", sdev));

        num.close(); // closing the scanner object
    }
}
