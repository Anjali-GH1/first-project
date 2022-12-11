import java.util.Arrays;
import java.util.Scanner;
//https://leetcode.com/problems/build-array-from-permutation/submissions/854533115/
public class BuildArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] ans = buildArray(nums);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int i;
        for (i = 0; i <= nums.length - 1; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
