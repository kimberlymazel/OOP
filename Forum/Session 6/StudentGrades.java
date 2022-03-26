/*
Write a program which prompts user for the number of students in a class
(a non-negative integer) and saves it in an int variable called numStudents.

It then prompts user for the grade of each of the students (integer between 0 to 100)
and saves them in an int array called grades.

The program shall then compute and print the average (in double rounded to 2 decimal places)
and minimum/maximum (in int).
*/

import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades {
    public static void main(String[] args){
        int numStudents; // number of students in class
        Scanner scan = new Scanner(System.in); // accept input from user
        
        // while loop to continue asking for number of students if less than 1
        while(true){

            // prompts user for number of students and saves it in numStudents
            System.out.print("Please enter the number of students: "); 
            numStudents = scan.nextInt();

            // if statement to display error message if number is less than 1
            if(numStudents<1){
                System.out.println("Number of students must be more than 0\n");
            }
            else{
                break;
            }
        }
        
        int [] grades = new int[numStudents]; // int array 
        int input; // input for each grade
        double total = 0; // total of grades
    
        // for loop, inputs each value into the array
        for(int i = 0; i < numStudents; i++){

            // while loop to continue asking for grade if it is less than 0 and more than 100
            while(true){
                System.out.print("Please enter the grades for student " + (i+1) + ": ");
                input = scan.nextInt();
                
                if(input>=0 && input<=100){
                    break; // break continues to code outside while loop
                }
                else{
                    System.out.println("Grades must be in between 0 and 100"); // error message before asking again
                }
            }
            grades[i] = input; // adds inputted value to grades array
            total += grades[i]; // total value of array
        }

        double average = total/numStudents; // average of grades
        
        // sorts array to get the maximum and minimum values
        Arrays.sort(grades);
        int minimum = grades[0]; // first value is lowest after sorting
        int maximum = grades[(numStudents-1)]; // last value is highest after sorting

        // printing out values
        System.out.println("The average is: " + String.format("%.2f", average));
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);

        scan.close(); // close scanner
    }
}
