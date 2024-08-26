package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class duplicate_arr_int {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a array size");
        int size=input.nextInt();

        int[] arr=new int[size];
        System.out.println("enter a "+size+"element");

        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();

        }
        System.out.println("the give input is: "+ Arrays.toString(arr));

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    System.out.println("the dupilcate arrays are: "+arr[j]);

            }

        }


    }
}
