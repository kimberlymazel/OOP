/*
Write a program called PrintArray which prompts user for the number of items in an array
(a non-negative integer) and saves it in an int variable called NUM_ITEMS.

It then prompts user for the values of all the items and saves them in an int array called items.

The program shall then print the contents of the array in the form of [x1, x2, ..., xn].
*/

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args){
        
        int NUM_ITEMS; // number of items in an array
        Scanner scan = new Scanner(System.in); // accept input from user

        // while loop to continue asking for number of items if less than 1
        while(true){

            // prompts user for number of items and saves it in NUM_ITEMS
            System.out.print("Please enter the number of items: "); 
            NUM_ITEMS = scan.nextInt();

            // if statement to display error message if number is less than 1
            if(NUM_ITEMS<=0){
                System.out.println("Number of items must be a positive integer.\n");
            }
            else{
                break;
            }
        }

        System.out.print("Please enter the numbers separated by a space: ");
        
        int [] items = new int[NUM_ITEMS]; // int array 

        // for loop, inputs each value into the array
        for(int i = 0; i < NUM_ITEMS; i++){
            items[i] = scan.nextInt();
        }

        // prints out the values 
        System.out.println("The values are: " + Arrays.toString(items));

        // closes scanner
        scan.close();
    }
}
