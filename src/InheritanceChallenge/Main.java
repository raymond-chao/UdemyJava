package InheritanceChallenge;

public class Main {

    public Main(){
//        SalariedEmployee bengt = new SalariedEmployee(50000, "Bengt", "09/03/1960", 1, "09/03/2000");
        Employee tom = new Employee("Tom", "09/03/1960", "09/03/2000");
        System.out.println(tom);
        System.out.println("Age: " + tom.getAge());
        System.out.println("Pay: " + tom.collectPay());

        SalariedEmployee joe = new SalariedEmployee(500000, "Joe", "01/01/1992", "01/01/2010");
        System.out.println(joe);
        System.out.println("Joe´s paycheck kr" + joe.collectPay());

        joe.retire();
        System.out.println("Joe´s retired paycheck: kr" +  joe.collectPay());
    }

    public static void main(String[] args) {
        new Main();
    }
}
