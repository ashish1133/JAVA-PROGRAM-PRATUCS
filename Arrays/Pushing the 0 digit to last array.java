class main{
    public static void main(String[] args) {

        int[]arr = {1,9,8,2,0,5,0,7,4};
        int[]result = new int[arr.length];

        int index=arr.length-1;

        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==0){
                result[index--]=0;
            }
        }

        for (int i= arr.length-1;i>=0;i--){
            if (arr[i]!=0){
                result[index--]=arr[i];
            }
        }

        for (int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}