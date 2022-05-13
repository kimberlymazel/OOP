import java.util.ArrayList;

public class Bank {
    // PRIVATE VARIABLES
    private ArrayList<Customer> customers = new ArrayList<Customer>(); // LIST OF CUSTOMERS
    private int numberOfCustomers; // NUMBER OF CUSTOMERS
    private String bankName;  // NAME OF BANK

    // PUBLIC METHODS
    public Bank(String bName){
        bankName = bName;
        numberOfCustomers = 0;
    } 

    // GET BANK NAME
    public String getName(){
        return bankName;
    }

    // METHOD TO ADD CUSTOMER
    public void addCustomer(String f, String l){
        Customer newEntry = new Customer(f, l);
        customers.add(newEntry);
        numberOfCustomers+=1;
    }

    // METHOD TO GET NUMBER OF CUSTOMER
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    // METHOD TO GET CUSTOMER BY INDEX
    public Customer getCustomer(int index){ 
        return customers.get(index);
    }
}
