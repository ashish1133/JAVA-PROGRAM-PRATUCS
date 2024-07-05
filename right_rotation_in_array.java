import java.util.Arrays;
import java.util.Scanner;

class  right_rotation_in_array{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int size =input.nextInt();

        System.out.println("enter a "+size+" elements");
        int [] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i]= input.nextInt();
        }

        System.out.println("enter a size of rigth rotation");

        int k=input.nextInt();
        int j;

        while (k>0){
            int last =arr[arr.length-1];
            for (j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }

            arr[j]=last;
            k--;

        }
        System.out.println(Arrays.toString(arr));

    }
}