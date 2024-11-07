import java.util.Arrays;
import java.util.HashMap;

class main{
    static int[]twosum(int[]nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int k = target-nums[i];
            if (map.containsKey(k)){
                return new int[]{map.get(k),i};
            }
            map.put(nums[i],i );
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {

        int[]nums = {2,8,7,9,21};
        int target = 10;
        int[]restul = twosum(nums,target);
        System.out.println("index : "+Arrays.toString(restul));

    }
}