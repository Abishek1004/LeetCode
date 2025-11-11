class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedArray = n*(n+1)/2;
        int actualArray = 0;

        for(int result:nums){
            actualArray+=result;
        }
        return expectedArray-actualArray;
    }
}