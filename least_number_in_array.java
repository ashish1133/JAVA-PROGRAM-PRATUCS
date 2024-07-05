import javax.xml.transform.Source;
import java.util.Scanner;

public class least_number_in_array {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a array size: ");
        int size = input.nextInt();

        int[] arr=new int[size];
        System.out.println("size of array are: "+size);

        for (int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
        if (min>arr[i])
            min=arr[i];
        }
        System.out.println("the lowest number in the array is: "+min );
    }
}
