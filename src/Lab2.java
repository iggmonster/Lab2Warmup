import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string pls");
        String str = input.nextLine().toLowerCase();
        countVowels(str);
        System.out.println(countVowels(str));

    }


    // INSERT APPROPRIATE COMMENT BLOCK HERE
    public static int countVowels( String s ) {
        int vowels = 0;
        for(int i = 0; i < s.length(); i++ ){
            if( s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'y') {
                vowels++;
            }
        }
        return vowels;
    }

}

