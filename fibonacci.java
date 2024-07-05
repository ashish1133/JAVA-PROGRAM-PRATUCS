import java.util.Scanner;

public class fibonacci {

    static void f(int N){
        int n1=0,n2=1;

        for (int i=0;i<=N;i++){

            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n1+" ");
        }
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number for fibonacci ");
        int n=input.nextInt();

        f(n);
    }
}
