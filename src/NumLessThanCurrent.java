public class NumLessThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,3,4};
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(ans);

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0; i< nums.length; i++){
            int count =0;
            for(int j=0; j< nums.length; j++){
                if(j!=i) {
                    if((nums[j] < nums[i])){
                        count++;
                        arr[i] = count;
                    }
                }
            }
        }
        return arr;
    }
}
