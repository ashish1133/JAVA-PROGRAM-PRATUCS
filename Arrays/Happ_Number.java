import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        long num = input.nextLong();
        input.close(); // Close scanner to avoid resource leak

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is not a Happy Number");
        }
    }

    public static boolean isHappy(long num) {
        HashSet<Long> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = getSumOfSquares(num);
        }

        return num == 1;
    }

    public static long getSumOfSquares(long n) {
        long sum = 0;
        while (n != 0) {
            long d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }
}
