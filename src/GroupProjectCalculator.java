import java.util.Scanner;
public class GroupProjectCalculator {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity of numbers you would like to add: ");
        int n = input.nextInt();

        int sum = 0;
        System.out.println("Enter your numbers!");
        for (int i = 0; i < n; i++) {
            int val = input.nextInt();
            sum += val;
        }
        System.out.println(sum);
    }

}