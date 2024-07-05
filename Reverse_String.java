import java.util.Scanner;
import java.io.*;

class Reverse_String{
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        String a=input.next();

        String rev="";
        char ch;
        for (int i =0;i<a.length();i++){

            ch=a.charAt(i);
            rev=ch+rev;

        }
        System.out.println("THE reverse siteing is a: "+rev);
    }
}