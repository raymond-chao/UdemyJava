package InheritanceChallenge;

public class SalariedEmployee extends Employee {
    private double anualSalary;
    private boolean isRetired = false;

    public SalariedEmployee(double anualSalary, String name, String birthDate,  String hireDate) {
        super(name, birthDate,hireDate);
        this.anualSalary = anualSalary;
    }


    public boolean retire(boolean isRetired) {
        if (isRetired == true) {
            System.out.println("Salaried Employee is retired");
        }
        return isRetired;
    }

    public double getAnualSalary() {
        return anualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }
    @Override
    public double collectPay(){
        double paycheck = (int) anualSalary / 26;
        double adjustPay = (isRetired) ? paycheck * 0.09 : paycheck;

        return (int) adjustPay;

    }
    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
