import java.util.Scanner;

public class basic_Arithmetic_operation {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter A number:");
        double a=input.nextInt();

        System.out.println("enter B number:");
        double b=input.nextInt();

       double c=a+b;
       double d=a-b;
       double e=a*b;
       double f=a/b;
       double g=a%b;

        System.out.println("add of A+B = "+c);
        System.out.println("add of A-B = "+d);
        System.out.println("add of A*B = "+e);
        System.out.println("add of A/B = "+f);
        System.out.println("add of A%B = "+g);


    }
}
