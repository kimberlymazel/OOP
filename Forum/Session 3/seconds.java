/*
Develop a Java program that, given an integer value representing a number of seconds,
transform it to an expression in hours, minutes, and seconds
(e.g. 3680 seconds are 1 hour, 1 minute, and 20 seconds).
*/

import java.util.Scanner;

public class seconds {
    public static void main(String[] args){
        Scanner seconds = new Scanner (System.in);
        
        // user input of number of seconds
        System.out.print("Please enter the number of seconds: ");
        int sec = seconds.nextInt();

        // calculating hour, minute and seconds
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int second = (sec % 3600) % 60;

        // prints statements
        System.out.println(sec + " seconds are " + hour + " hour, " + min + " minute, " + second + " seconds.");

        seconds.close(); // close scanner
    }
}
