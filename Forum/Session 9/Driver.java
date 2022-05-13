import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        
        Scanner scaninput = new Scanner(System.in);

        Bank Banks = new Bank("Kim's Bank");
        
        System.out.println("Welcome to " + Banks.getName() + "!");
        System.out.println("");

        int choice = 0;

        // MAIN MENU
        while(choice!=3){
            System.out.println("===== MAIN MENU =====");
            System.out.println("Are you an admin or a client?");
            System.out.println("1. Admin");
            System.out.println("2. Client");
            System.out.println("3. Exit");
            System.out.println("");
            System.out.print("Please enter your choice: ");

            choice = scaninput.nextInt();

            switch(choice){
                // ADMIN MENU
                case 1:
                    int adminchoice = 0;

                    while(adminchoice!=4){
                        System.out.println("");
                        System.out.println("===== ADMIN MENU =====");
                        System.out.println("Welcome Admin. What would you like to do?");
                        System.out.println("1. Add a customer");
                        System.out.println("2. Get number of customers");
                        System.out.println("3. Search customer by index");
                        System.out.println("4. Return to main menu");
                        System.out.println("");
                        System.out.print("Please enter your choice: ");

                        adminchoice = scaninput.nextInt();

                        Scanner name = new Scanner(System.in);

                        switch(adminchoice){
                            // ADD CUSTOMER
                            case 1:
                                System.out.println("");
                                System.out.println("===== ADDING A CUSTOMER =====");

                                // ADDING FIRST NAME
                                System.out.print("Please enter the customer's first name: ");
                                String firstname = name.nextLine();

                                // ADDING SECOND NAME
                                System.out.print("Please enter the customer's last name: ");
                                String lastname = name.nextLine();

                                System.out.println("");
                                Banks.addCustomer(firstname, lastname);

                                // CONFIRMATION MESSAGE
                                System.out.println(firstname + " " + lastname + " has been added to the bank.");
                                break;
                            
                            // GET LIST OF CUSTOMERS
                            case 2:
                                System.out.println("");
                                System.out.println("===== GET LIST OF CUSTOMERS =====");
                                int num = Banks.getNumOfCustomers();
                                System.out.println("The number of customers is: " + num);
                                break;

                            // SEARCH CUSTOMER BY INDEX
                            case 3:
                                System.out.println("");
                                System.out.println("===== SEARCH CUSTOMER BY INDEX =====");
                                System.out.print("Please enter the index of the desired customer: ");
                                int index = (scaninput.nextInt())-1;

                                // VALIDATION
                                if((index+1) > Banks.getNumOfCustomers() || (index+1)<=0){
                                    System.out.println("The index is out of range. Please try again.");
                                }
                                
                                // PRINTS CUSTOMER'S NAME AT INDEX
                                else{
                                    String customer = Banks.getCustomer(index).getFirstName() + " " + Banks.getCustomer(index).getLastName();
                                    System.out.println("The customer at index " + (index+1) + " is " + customer);
                                }
                                break;

                            // RETURN TO MAIN MENU
                            case 4:
                                System.out.println("");
                                System.out.println("Returning to the main menu...");
                                System.out.println("");
                                break;

                            // DEFAULT FOR VALIDATION
                            default:
                                System.out.println("The input is invalid. Please try again.");
                                break;
                        }

                        name.close();
                    }
                    break;

                // CLIENT MENU
                case 2:
                    int clientchoice = 0;
                    Account newacc = new Account(0);

                    while(clientchoice !=5){
                        System.out.println("");
                        System.out.println("===== CLIENT MENU =====");
                        System.out.println("Welcome Client. What would you like to do?");
                        System.out.println("1. Open an account");
                        System.out.println("2. Check balance");
                        System.out.println("3. Deposit");
                        System.out.println("4. Withdraw");
                        System.out.println("5. Return to main menu");
                        System.out.println("");
                        System.out.print("Please enter your choice: ");

                        clientchoice = scaninput.nextInt();

                        Scanner client = new Scanner(System.in);

                        switch(clientchoice){
                            // OPENING AN ACCOUNT
                            case 1:
                                System.out.println("");
                                System.out.println("===== OPENING AN ACCOUNT =====");

                                // FIRST NAME
                                System.out.print("Please enter the first name: ");
                                String first = client.nextLine();

                                // SECOND NAME
                                System.out.print("Please enter the last name: ");
                                String last = client.nextLine();

                                System.out.println("");
                                Banks.addCustomer(first, last);
                                System.out.println(first + " " + last + " has been added to the bank.");
                                System.out.println("");

                                // INITIAL DEPOSIT
                                System.out.print("Please enter the first deposit: ");
                                Double deposit = scaninput.nextDouble();
                                newacc.deposit(deposit);
                                System.out.println("Deposit has been made. Thank you for creating an account.");
                                break; 
                            
                            // CHECKING BALANCE
                            case 2:
                                System.out.println("");
                                System.out.println("===== CHECK BALANCE =====");

                                Double bal = newacc.getBalance();
                                System.out.println("Your balance is: " + bal);
                                break;
                            
                            // DEPOSIT
                            case 3:
                                System.out.println("");
                                System.out.println("===== DEPOSIT =====");

                                System.out.print("Please enter the amount to be deposited: ");
                                Double depo = scaninput.nextDouble();

                                newacc.deposit(depo);
                                break;
                            
                            // WITHDRAWING
                            case 4:
                                System.out.println("");
                                System.out.println("===== WITHDRAW =====");

                                System.out.print("Please enter the amount to be withdrawn: ");
                                Double withdraw = scaninput.nextDouble();

                                newacc.withdraw(withdraw);
                                break;

                            // RETURNING TO MAIN MENU
                            case 5:
                                System.out.println("");
                                System.out.println("Returning to the main menu...");
                                System.out.println("");
                                break;

                            // VALIDATION
                            default:
                                System.out.println("The input is invalid. Please try again.");
                                break;
                        }
                        
                        client.close();

                    }
                    break;

                // EXITING THE PROGRAM
                case 3:
                    System.out.println("Thank you for using the system.");
                    break;
                
                // VALIDATION
                default:
                    System.out.println("The input is invalid. Please try again.");
                    break;
            }
        }

        scaninput.close();

    }
}
