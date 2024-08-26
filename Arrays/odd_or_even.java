package Arrays;

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int i=input.nextInt();

        if(i%2==0){
            System.out.println(i+" is even");
        }
        else {
            System.out.println(i+" is odd");
        }

    }
}
