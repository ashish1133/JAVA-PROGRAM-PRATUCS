class main{
    static int partitions(int[]arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;

        for (int j =low;j<high;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int[]arr,int i,int j ){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void Quick_Sort(int[]arr,int low,int high){
        if (low<high){
            int pi = partitions(arr,low,high);
            Quick_Sort(arr,low,pi-1);
            Quick_Sort(arr,pi+1,high);
        }
    }
    static void print(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
    }

    public static void main(String[] args) {

        int[]arr = {9,1,2,8,3,7,4,6,5};
        int n = arr.length;

        Quick_Sort(arr,0,n-1);
        print(arr);

    }
}
