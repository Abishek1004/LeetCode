class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int[] new_Arr=new int[size];
        int position=0;
        int copy;
        for(int num1:nums1){
            new_Arr[position++]=num1;
        }
        for(int num2:nums2) {
                new_Arr[position++] =num2;
        }
        Arrays.sort(new_Arr);
        if(new_Arr.length % 2!=0){
            int median=new_Arr.length/2;
            return new_Arr[median];
        }
        else{
            int median=new_Arr.length/2;
            return (new_Arr[median]+new_Arr[median-1])/2.0;
        }
    }
}