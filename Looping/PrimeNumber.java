package Looping;

public class PrimeNumber {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num =3;
        if (isprime(num)){
            System.out.println("is a prime number");
        }else{
            System.out.println("not a prime number");
        }
    }
}
