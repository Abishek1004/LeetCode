class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        int second = findsecond(nums,target);

        return new int[]{first,second};
    }
    private int findfirst(int[] nums,int target){
        int low=0,high = nums.length-1;
        int pos=-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target){
                pos = mid;
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return pos;
    }
    private int findsecond(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                pos = mid;
                low = mid + 1; 
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return pos;
    }
}