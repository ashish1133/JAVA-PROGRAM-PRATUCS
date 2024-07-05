import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class left_rotation_an_array{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size=input.nextInt();

        System.out.println("enter a "+size+" elements");
        int[] arr= new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("rotation size: ");
        int k=input.nextInt();


    for (int i=0;i<k;i++){
        int first=arr[0],j;
        for (j=0;j< arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        arr[j]=first;


    }
for (int i=0;i< arr.length;i++)
        System.out.print(Arrays.toString(arr));

    }

}

