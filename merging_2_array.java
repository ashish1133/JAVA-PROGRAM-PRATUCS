import java.util.Arrays;

class merging_2_array{
    public static void main(String[] args) {

        int[] a = {1,3,5,7,9};
        System.out.println("the a array is: "+Arrays.toString(a));
        int[] b = {2,4,6,8,10};
        System.out.println("the b array is: "+Arrays.toString(b));

        int[] c = new int[a.length + b.length];

        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i< b.length;i++){
            c[i + a.length]=b[i];
        }
        System.out.println(Arrays.toString(c));

    }
}