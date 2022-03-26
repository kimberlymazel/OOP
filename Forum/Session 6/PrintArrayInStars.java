/*
Write a program called printArrayInStars which prompts user for the number of items in an array
(a non-negative integer) and saves it in an int variable called NUM_ITEMS.

It then prompts user for the values of all the items (non-negative integers)
and saves them in an int array called items.

The program shall then print the contents of the array in a graphical form,
with the array index and values represented by number of stars.
*/

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args){
        int NUM_ITEMS; // number of items in an array
        Scanner scan = new Scanner(System.in); // accept input from user

        // while loop to continue asking for number of items if less than 0
        while(true){

            // prompts user for number of items and saves it in NUM_ITEMS
            System.out.print("Please enter the number of items: "); 
            NUM_ITEMS = scan.nextInt();

            // if statement to display error message if number is less than 0
            if(NUM_ITEMS<0){
                System.out.println("Number of items cannot be a non-positive integer.\n");
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

        // for loop, prints out * and value in brackets
        for (int i = 0; i < items.length; ++i){
                System.out.println((i+1) + ": " + "*".repeat(items[i]) + " (" + items[i] + ")");
                // i + 1 for the number in front (example 1:)
                // "*".repeat(items[i]) to repeat * for each number in the array
                // "(" + items[i] + ")" to display value in array (value of stars)
        }

        scan.close(); // close scanner

    }
    
}
