public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(target);
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i =0; i< nums.length; i++){
            if(nums[i] == index[i]){
                target[i] = nums[i];
            }else if (nums[i] != index[i]){
                target[index[nums[i]]]= nums[i];
            }
        }
        return target;
    }
}
//0,4,1,3,2