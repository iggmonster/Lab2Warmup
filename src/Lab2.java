import java.util.Scanner;

public class Lab2 {
// problem 1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string pls");
        String str = input.nextLine().toLowerCase();
        countVowels(str);
        System.out.println(countVowels(str));




// problem 2

            Scanner input2 = new Scanner(System.in);
            System.out.print("What number do you want to compute? ");
            int numbers = input2.nextInt();
            System.out.println(sumOddDigits(numbers));

// problem 3
        Scanner input3 = new Scanner(System.in);
        System.out.print("Please enter a value for n: ");
        int val = input3.nextInt();
        Lab2 object = new Lab2();
        System.out.println(object.euler(val));


            // problem 2 pt 2

        }
        public static long sumOddDigits(int n) {
            int total = 0;
            String number = String.valueOf(n);
            int currentNumber = 0;
            for(int i = 0; i < number.length(); i++){
                if(number.charAt(i) == '1' || number.charAt(i) == '3' || number.charAt(i) == '5' || number.charAt(i) == '7' || number.charAt(i) == '9'){
                    currentNumber = Integer.parseInt(String.valueOf(number.charAt(i)));
                    total = total + currentNumber;
                }
            }
            return(total);

        }






    // problem 1 pt 2
    public static int countVowels( String s ) {
        int vowels = 0;
        for(int i = 0; i < s.length(); i++ ){
            if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'y') {
                vowels++;
            }
        }
        return vowels;
    }
    // problem 3 pt 2
    public double euler(int n) {

        if (n < 1 || n > 100000) {
            System.out.println("number out of range");
            return 0;
        }

        double eulerVal = 1.0;
        for (int i = 1; i <= n; i++) {
            double factorial = 1.0;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * (1.0 / j);
            }
            eulerVal += factorial;
        }
        return eulerVal;
    }

}

