class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] resultArray = new int[nums.length];

        int positiveNumber = -2;
        int negativeNumber = -1;
        for(int n: nums){
            if(n>=0){
                resultArray[positiveNumber+=2]=n;
            }
            else{
                resultArray[negativeNumber+=2]=n;
            }
        }
        return resultArray;
    }
}