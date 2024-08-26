package Arrays;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter a the Arrays.Factorial number:");
        int a=input.nextInt();

        int fact=1;
        for (int i = 1; i<=a; i++){
            fact=fact*i;

        }
        System.out.println(fact);

    }
}
