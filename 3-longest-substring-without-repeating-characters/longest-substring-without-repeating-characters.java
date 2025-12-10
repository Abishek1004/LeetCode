class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256]; 
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (hash[ch] == 1) {
                hash[s.charAt(left)]--;
                left++;
            }
            hash[ch] = 1;
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
