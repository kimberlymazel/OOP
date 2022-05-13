public class Account {
    // PRIVATE ATTRIBUTE BALANCE
    private int balance;

    // GETTER
    public int getBalance(){
        return balance;
    }

    // SETTER
    public void setBalance(int setbal){
        this.balance = setbal;
    }

    // DEPOSIT
    public void deposit(int depoVal){
        this.balance+=depoVal;
    }

    // WITHDRAW
    public void withdraw(int withdrawVal){
        this.balance-=withdrawVal;
    }
}
