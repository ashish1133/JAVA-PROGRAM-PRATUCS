import java.sql.SQLOutput;
import java.util.Scanner;

public class finding_largest_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ente a size of the array");
        int size = input.nextInt();

        int[] arr =new int[size];
        System.out.println("the size of the array: "+size);

        for (int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        int max=arr[0];
        for (int i=0;i<arr.length;i++ ){
            if (arr[i]>max)
                max=arr[i];

        }
        System.out.println("largest number in the array are: "+max);
    }
}