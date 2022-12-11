import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        // creating an array
        Scanner in = new Scanner(System.in);

        int[] nums = {1,2,1,4,5,6};
        int n = 3;
        // calling a function
        int[] ans = shuffle(nums, n);
        System.out.print(Arrays.toString(ans));

    }
    public static int[] shuffle(int[] nums, int n){

        int[] arr = new int[2 * n];

        for (int i = 0; i < n; i++) {
            arr[i*2] = nums[i];
            arr[i*2 + 1] = nums[i+n];
        }
        return arr;
    }
}
