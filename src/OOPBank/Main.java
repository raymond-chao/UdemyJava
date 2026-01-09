package OOPBank;

public class Main {
    public Main(){
        BankAccount myAccount = new BankAccount();
//        myAccount.setCustomerName("Mjao");
//        myAccount.setPhoneNumber("1234");
//        myAccount.setAccountBalance(1000);
//        myAccount.setCustomerEmail("mjao@mjao.com");
//        myAccount.setAccountNumber(1);

        Customer myCustomer = new Customer("Ray", 1000, "ray@ray.com");
        System.out.println(myCustomer.getName());
        System.out.println(myCustomer.getCreditLimit());
        System.out.println(myCustomer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Joe", "joe@joe.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());


    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
