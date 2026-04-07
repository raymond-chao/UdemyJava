package AutoboxingChallenge;


import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, Double initialDeposit){
        this(name.toUpperCase(), new ArrayList<>(500));
        transactions.add(initialDeposit);

    }
}


public class Main {
    public Main(){
        Customer bob = new Customer("Bob", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("SEB");
        bank.addCustomer("Jane D", 500);
        System.out.println(bank);

        bank.addTransaction("Jane D", -10.25);
        bank.addTransaction("Jane D", -75.01);
        bank.printStatement("jane d");


    }

    class Bank {
        private String name;
        private ArrayList<Customer> customers = new ArrayList<>();

        public Bank(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Bank{" +
                    "name='" + name + '\'' +
                    ", customers=" + customers +
                    '}';
        }

        private Customer getCustomer(String customerName){
            for (var customer : customers) {
                if (customerName.equalsIgnoreCase(customer.name())){
                    return customer;
                }
            }
            System.out.printf("Customer: %s not found %n", customerName);
            return null;
        }

        public void addCustomer(String customerName, double initialDeposit){
            if (getCustomer(customerName) == null){
                customers.add(new Customer(customerName, initialDeposit));
                System.out.println("New customer added: " + customerName);

            }
        }
        public void addTransaction(String name, double transactionAmount){
            Customer customer = getCustomer(name);
            if (customer != null) {
                customer.transactions().add(transactionAmount);
            }
        }
        public void printStatement(String name){
         Customer customer = getCustomer(name);
         if (customer== null) {
             return ;
         }
            System.out.println("Customer name: " + customer.name());
            System.out.println("Transactions: ");
            for (Double d : customer.transactions()) {
                System.out.printf("%10.2f %s %n", d,d < 0 ? "debit" : "credit");
            }
        }
    }


    static void main() {
        new Main();
    }

}

