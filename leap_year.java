import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a year: ");
        int year =input.nextInt();

        boolean leap_year = false;

        if (year%4==0){
            leap_year =true;

            if (year%100==0){

                if (year%400==0){
                    leap_year =true;
                }
                else {
                    leap_year= false;
                }
            }
        }
        else {

            leap_year = false;
        }
        System.out.println(leap_year);

    }

}
