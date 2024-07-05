import java.util.Arrays;
import java.util.Scanner;

class Array_sorting_ascending_order {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter a array size");
        int size= input.nextInt();

        int[] arr=new int[size];
        System.out.println("enter a "+size+"elements");
        for (int i=0;i< arr.length;i++){

            arr[i]=input.nextInt();
        }
        System.out.println("The Original array before sort is: "+Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}