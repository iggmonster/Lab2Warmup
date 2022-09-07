import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2Warmup2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Enter a number in pounds:");
        double poundTown = Double.parseDouble(input.next());
        System.out.println(poundTown + " pounds is " + df.format(poundTown * 0.454) + " kilograms");
    }
}
