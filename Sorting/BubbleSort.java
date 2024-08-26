package Sorting;

public class BubbleSort {
    static void bubblesort(int[]arr,int n){
        int i,j,temp;
        boolean swapped;
        for (i=0;i<n-1;i++){
            swapped = false;
            for (j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){

                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (swapped=false)
                break;
        }
    }
    static  void printArray(int[]arr,int size){
        int i;
        for (i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[]arr={324,876,123,987,454,859,253};
        int n= arr.length;
        bubblesort(arr,n);
        printArray(arr,n);
    }
}
