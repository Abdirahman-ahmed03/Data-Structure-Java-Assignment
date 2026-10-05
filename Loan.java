package D_S_Assignment;

import java.util.Date;

public class Loan {
    // Fields
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor
    public Loan() {
        this(2.5, 1, 1000.0);
    }

    // Constructor with parameters
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    // Getters and Setters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Methods
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

class TestLoan {
    public static void main(String[] args) {
        Loan loan1 = new Loan(); // Default values
        System.out.println("Default Loan Date: " + loan1.getLoanDate());
        System.out.printf("Default Monthly Payment: $%.2f\n", loan1.getMonthlyPayment());
        System.out.printf("Default Total Payment: $%.2f\n", loan1.getTotalPayment());

        System.out.println("------------------------------------");

        Loan loan2 = new Loan(5.5, 5, 20000);
        System.out.println("Custom Loan Date: " + loan2.getLoanDate());
        System.out.printf("Custom Monthly Payment: $%.2f\n", loan2.getMonthlyPayment());
        System.out.printf("Custom Total Payment: $%.2f\n", loan2.getTotalPayment());
    }
}

