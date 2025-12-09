class Solution {
    static{
        for(int i=0; i<=500; i++) moveZeroes(new int[]{});
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0, j=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                continue;
            }
            else
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}