package app;

public class Salaried extends Employee {

    private static int MONTHS_IN_YEAR = 12;
    private double yearlySalary;

    public Salaried(String name, double yearlySalary) {
        super(name);  // so at this point java moves to the Employee constructor and executes everything in it
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculatePay() {
        return yearlySalary / MONTHS_IN_YEAR;  // you can but thats what's called a magic number
    }

} 