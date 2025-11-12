class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultCopy = new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                resultCopy.add(num);
            }
        }

        int[] result = new int[resultCopy.size()];
        int index = 0;
        for(int res: resultCopy){
            result[index++] = res;
        }
        return result;
    }
}