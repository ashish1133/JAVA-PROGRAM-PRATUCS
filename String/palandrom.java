package String;

import java.util.Scanner;

public class palandrom {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter a Interge or String to find the give input is String.palandrom or not: ");
        String a =input.next();

        String rev="";
        char ch;

        for (int i =a.length()-1;i>=0;i--){

            ch=a.charAt(i);
            rev=rev+ch;

        }
        System.out.println("The revrse String or Integer are: "+rev);

        if(a.equals(rev)){
            System.out.println("Its a String.palandrom");
        }
        else {
            System.out.println("its not a String.palandrom");
        }


    }

}
