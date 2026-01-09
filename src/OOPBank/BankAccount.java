package OOPBank;

public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(123, 1000, "mjao", "mjao@mjao.com", "123");
        System.out.println("This bankaccount called");
    }

    public BankAccount(int accountNumber, int accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public void desposit(int depositAmount) {
        if (accountBalance + depositAmount < 0) {
            System.out.println("Invalid deposit amount");
        } else {
            accountBalance += depositAmount;
            System.out.println("Deposited " + depositAmount + " current balance: " + accountBalance);
        }

    }
    public void withdraw(int withdrawAmount) {
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("Invalid withdraw amount");
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdraw amount: " + withdrawAmount +
                    "Remaining balance: " + accountBalance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
