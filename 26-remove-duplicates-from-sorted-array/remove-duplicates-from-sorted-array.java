class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPosition = 1;
        for(int i=1; i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[insertPosition]=nums[i];
                insertPosition++;
            }
        }
        return insertPosition;
    }
}