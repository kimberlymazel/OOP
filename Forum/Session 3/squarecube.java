/*
Using only the programming techniques you learned in this lesson,
write an application that calculates the squares and cubes of the
numbers from 0 to 10 and prints the resulting values in table format
*/

public class squarecube {
    public static void main(String[] arg){
        // printing header of the table
        System.out.println("number\tsquare\tcube");

        // for loop to print all values from 0 to 10
        for(int i = 0; i < 11; i++){
            int square = (int) Math.pow(i, 2); // (int) needed as Math.pow takes in double values
            int cube = (int) Math.pow(i, 3);

            // prints the number, squared value and cubed value for each i
            System.out.println(i + "\t" + square + "\t" + cube + "\t");
        }

    }
}