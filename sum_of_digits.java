import java.util.Scanner;

class sum_of_digit{
    public static void main(String[] args) {

        long digit,sum=0;

        Scanner input= new Scanner(System.in);
        System.out.println("enter a digit: ");
        long arr=input.nextLong();

        while(arr>0){

            digit = arr % 10;

            sum =sum + digit;

            arr = arr / 10;


        }
        System.out.println("dogit of the sum is: "+sum);


    }
}