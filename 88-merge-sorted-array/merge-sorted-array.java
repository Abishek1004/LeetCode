class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge arrays from right to left
        // Continue until all elements from nums2 are processed (j >= 0)
        while (j >= 0) {
            // If nums1 has remaining elements AND current element in nums1 is greater than nums2
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Place the larger element from nums1
                i--; // Move to the previous element in nums1
            } else {
                // Otherwise, take the element from nums2 (either nums1 is exhausted or nums2[j] is larger)
                nums1[k] = nums2[j];
                j--; // Move to the previous element in nums2
            }
            k--; // Move to the previous position in nums1 for the next element
        }
    }
}