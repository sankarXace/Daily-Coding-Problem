import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static int[] solve(int[] nums) {
        int result [] = new int[nums.length];
        int runningProduct = 1;
        for(int i=0;i<nums.length;i++){
            result[i] = runningProduct;
            runningProduct *= nums[i];
        }
        runningProduct = 1;
        for(int i=nums.length-1;i>=0;i--){
            result[i] *= runningProduct;
            runningProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = solve(nums);
        for(int i:result) System.out.print(i+" ");
    }
}