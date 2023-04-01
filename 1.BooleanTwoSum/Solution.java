import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static boolean solve(int[] nums, int k) {
        ArrayList<Integer> check = new ArrayList<>();
        for (int i : nums) {
            int diff = k - i;
            if (check.contains(diff)) {
                return true;
            }
            check.add(i);
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(in.readLine());
        boolean result = solve(nums, k);
        System.out.println(result);
    }
}