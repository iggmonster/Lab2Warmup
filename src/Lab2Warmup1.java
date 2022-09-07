import java.util.Scanner;

public class Lab2Warmup1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int int1 = Integer.parseInt(input.next());
        int int2 = Integer.parseInt(input.next());
        int int3 = Integer.parseInt(input.next());
        if (int1 > int2){
            if (int2 > int3){
                System.out.println(int1 + int2 + int3);
            }
            }
        }


    }
}
