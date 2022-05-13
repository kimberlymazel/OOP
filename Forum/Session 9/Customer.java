public class Customer {
    // PRIVATE VARIABLES
    private String firstName; // CUSTOMER FIRST NAME
    private String lastName;  // CUSTOMER LAST NAME
    private Account account;  // ACCOUNT

    // CONSTRUCTOR
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
        account = new Account(0.0);
    }

    // PUBLIC METHOD GET FIRST NAME
    public String getFirstName(){
        return firstName;
    }

    // PUBLIC METHOD GET LAST NAME
    public String getLastName(){
        return lastName;
    }

    // PUBLIC METHOD GET ACCOUNT
    public Account getAccount(){
        return account;
    }

    // PUBLIC METHOD SET ACCOUNT
    public void setAccount(Account acct){
        account = acct;
    }
}
