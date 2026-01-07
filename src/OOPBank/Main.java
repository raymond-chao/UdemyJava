package OOPBank;

public class Main {
    public Main(){
        BankAccount account = new BankAccount();
        account.withdraw(100);
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
