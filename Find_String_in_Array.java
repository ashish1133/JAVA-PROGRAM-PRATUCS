public class Find_String_in_Array {
    public static void main(String[] args) {

        String[]arr={"Ashish","Ashok","Smitha","Priyanak"};
        String k = "Smitha";
        int n = arr.length;
        int reuslt = Linear_Search(arr,k,n);
        if(reuslt==-1)
            System.out.println("Sting is not in the List");
        else
            System.out.println(reuslt);
    }
    static int Linear_Search(String[]arr,String k,int n){

        for (int i=0;i<n;i++){
            if (arr[i].equals(k))
                return i;
        }
        return -1;
    }
}
