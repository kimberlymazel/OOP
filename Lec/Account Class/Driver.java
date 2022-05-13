public class Driver {
    public static void main(String[] args){
        Account test = new Account();

        // SETTING BALANCE
        test.setBalance(5000);
        System.out.println(test.getBalance());

        // DEPOSITING
        test.deposit(200);
        System.out.println(test.getBalance());

        // WITHDRAWING
        test.withdraw(100);
        System.out.println(test.getBalance());
    }
}
