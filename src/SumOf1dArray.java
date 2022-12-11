import java.util.Arrays;

public class SumOf1dArray {
    public static void main(String[] args) {
        //creating an array
        int[] arr = {1, 2, 1};
        int[] nums = runningSum(arr);

        System.out.print(Arrays.toString(nums));

    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
