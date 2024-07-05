import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_sorting_decinding_order {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a array size");
        int size=input.nextInt();

        Integer[] arr=new Integer[size];
        System.out.println("enter a "+size+" element: ");

        for (int i=0;i<arr.length;i++) {
            arr[i] = input.nextInt();
        }

            System.out.println("the orginal size of arr is: " + Arrays.toString(arr));

            Arrays.sort(arr, Collections.reverseOrder());

            System.out.println("array after sorted: " + Arrays.toString(arr));


    }
}
