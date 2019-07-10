package app;

public class Hourly extends Employee {

    private double hoursWorked;// could u say the number like = 75
    private double hourlyRate;

    public Hourly(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked; // so the constructors creates which objects?
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}