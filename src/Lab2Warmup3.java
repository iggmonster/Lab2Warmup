import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2Warmup3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Enter investment amount: ");
        Double investmentAmount = Double.valueOf(input.nextLine());
        System.out.print("Enter yearly interest rate: ");
        Double annualInterestRate = Double.valueOf(input.nextLine());
        System.out.print("Enter number of years: ");
        Double numberOfYears = Double.valueOf(input.nextLine());
        calculateFutureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears);

        System.out.println("Accumulated value is " + df.format((calculateFutureInvestmentValue(investmentAmount, annualInterestRate, numberOfYears))));

// futureInvestment Value = investmentAmount ∗ (1 + annualInterestRate/12) ^ numberOfYears∗12
    }


    public static double calculateFutureInvestmentValue ( double investmentAmount,
    double annualInterestRate, double numberOfYears ) {
        Double futureInvestmentValue = Double.valueOf(0);
        futureInvestmentValue = investmentAmount * Math.pow ((1 + (annualInterestRate / 100) / 12) , (numberOfYears * 12));

        return futureInvestmentValue;
    }
}

