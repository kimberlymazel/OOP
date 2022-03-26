import java.util.Scanner;

class RobbyRobot {
    public static void main(String[] args) {
        // Declare variables outside do while loop so it can be accessed throughout (no out of scope errors)
        int userChoice = 0; // user's choice for instructions
        
        String direction = "n/a"; // direction of movement
        int distance = 0; // distance of movement
        
        int xdist = 0; // x coordinate
        int ydist = 0; // y coordinate
        
        // do while loop, runs the code at least once but stops if the user choice is 4 (quit)
        do{
            Scanner userinput = new Scanner(System.in); // scanner to take input from user
            System.out.println("Robby Instructions"+ "\n"+"1. Move"+"\n"+"2. Location"+"\n"+"3. Reset"+"\n"+"4. Quit"); // displays options of instructions
            System.out.print("Choice >> "); // asks for user's choice
            userChoice = userinput.nextInt(); // update svariable for user's choice

            // switch case for user's choice
            switch(userChoice){
                // movement option
                case 1:
                Scanner case1 = new Scanner(System.in);

                System.out.print("Enter direction (N,E,W,S) >> "); // asks user for direction (north, east, west, south)
                direction = case1.nextLine();

                System.out.print("Enter distance (>0) >> ");  // asks user for distance
                distance = case1.nextInt();

                // switch case for direction
                switch(direction){
                    // if north, increase ydist
                    case "North":
                        ydist = ydist + distance;
                        break;

                    // if south, decrease ydist
                    case "South":
                        ydist = ydist - distance;
                        break;

                    // if east, increase xdist
                    case "East":
                        xdist = xdist + distance;
                        break;

                    // if west, decrease xdist
                    case "West":
                        xdist = xdist - distance;
                        break;
                }

                // prints summary of movement and direction
                System.out.println("Robby moved " + direction + ", " + distance + " units");
                System.out.println("\n");
                break;

                // location option
                case 2:
                System.out.println("Robby is currently at (" + xdist + "," + ydist + ")"); // prints current location of robby
                System.out.println("\n");
                break;

                // reset location
                case 3:
                System.out.println("Robby reset at (" + xdist + "," + ydist + ")"); // prints last location
                
                // resets xdist and ydist to 0
                xdist = 0;
                ydist = 0;
                System.out.println("\n");
                break;

                //  quit option
                case 4:
                System.out.println("Goodbye!!"); // prints goodbye
                System.out.println("\n");
                break;
            }
        } while (userChoice != 4);
    }
}
