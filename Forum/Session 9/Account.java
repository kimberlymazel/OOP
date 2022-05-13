public class Account {
    // PRIVATE VARIABLE BALANCE
    private double balance;

    // CONSTRUCTOR
    public Account(double init__balance){
        balance = init__balance;
    }

    // PUBLIC METHOD TO GET BALANCE
    public double getBalance(){
        return balance;
    }

    // PUBLIC METHOD TO DEPOSIT
    public Boolean deposit(double amt){
        // IF DEPOSIT AMOUNT IS LESS THAN 0 RETURN FALSE
        if (amt <=0){
            System.out.println("Deposit amount must be more than 0.");
            return false;
        }

        // IF DEPOSIT AMOUNT IS MORE THAN 0 RETURN TRUE, BALANCE UPDATE
        else{
            balance += amt; // DEPOSIT AMOUNT ADDED TO BALANCE
            System.out.println("The amount has been deposited.");
            return true;
        }
    }

    // PUBLIC METHOD TO WITHDRAW
    public Boolean withdraw(double amt){
        // IF DEPOSIT AMOUNT IS LESS THAN 0 RETURN FALSE
        if (amt <=0){
            System.out.println("Withdrawal amount must be more than 0.");
            return false;
        }

        // IF DEPOSIT AMOUNT IS MORE THAN BALANCE
        else if(amt>balance){
            System.out.println("Withdrawal amount cannot be more than the balance.");
            return false;
        }

        // IF DEPOSIT AMOUNT IS MORE THAN 0 RETURN TRUE, BALANCE UPDATE
        else{
            balance -= amt; // WITHDRAW AMOUNT REDUCED FROM BALANCE
            System.out.println("The amount has been withdrawn.");
            return true;
        }
    }
}
