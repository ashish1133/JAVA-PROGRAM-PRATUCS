package String;

import java.io.IOException;
import java.util.Scanner;

public class Square_Root {

    public static void main(String[] args) throws IOException {

        Scanner o = new Scanner(System.in);

        System.out.println("Enter a number to find the number of square root:");



        System.out.println(Math.sqrt(o.nextInt()));
    }
}
