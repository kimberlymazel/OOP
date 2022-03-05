/*
Develop a Java program to exchange the values of two integer variables

(e.g.: if x is equal to 10 and y is equal to 5, at the end of the program,
x must be equal to 5 and y equals to 10).

(Initialize the variables in the code; do not read from the keyboard.)
*/

public class exchange {
    public static void main(String[] arg){
        // initializing x, y and temporary value
        int x = 10;
        int y = 5;
        int temporary = y;

        // printing values before swap
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("COMMENCING SWAP");

        // swapping the values
        y = x;
        x = temporary;

        // printing the values after the swap
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("SWAP COMPLETED");
    }
}
