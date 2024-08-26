package Looping;

public class Reverse_Integer {

    public static void main(String[] args) {

        int k= 123;

        int sum=0,digit;
        k=Math.abs(k);
        while (k>0){

            digit = k%10;
            sum = (sum*10) + digit;
            k = k/10;

        }
        System.out.println(sum);

    }

}
