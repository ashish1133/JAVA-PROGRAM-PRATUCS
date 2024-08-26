package Searching;

class Linear_Search{
    public static void main(String[] args) {

        int[]arr={6,3,9,8,1,2,4,7};
        int n = arr.length;
        int k =3;
        int result=search(arr,k,n);
        if(result==-1)
            System.out.println("not found");
        else
            System.out.println(result);
    }
    static int search(int[]arr,int k,int n){

        for (int i=0;i<n;i++){
            if (arr[i]==k)
                return i;
        }
        return -1;
    }
}