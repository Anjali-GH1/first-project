import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        // creating an array
        int[] nums = {1,2,1};
        // calling a function
        int[] ans = getConcatenation(nums);
        System.out.print(Arrays.toString(ans));

    }
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        return arr;
/*
int n = nums.length;
        int[] arr = new int[2 * n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
 */

    }

}
