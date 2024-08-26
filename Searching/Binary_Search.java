package Searching;

import java.util.Scanner;

class Bsearch {
    public static void main(String[]args){
        binary_search o= new binary_search();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Array Size: ");
        int size = input.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the element on Array");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the finding element: ");
        int x= input.nextInt();
        int n = arr.length;
        int result=o.bs(arr,x);
        if(result==-1)
            System.out.println("The Element on the arrays is not found");
        else
            System.out.println("The "+x+" Element on the index of "+result);
    }
}
class binary_search{
    int bs(int[] arr,int x){

        int low=0;
        int high=arr.length-1;
        while(low<=high){

            int mid= low+(high-low)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[mid]<x)
                low=mid+1;

            else
                high= mid-1;
        }
        return -1;
    }

}