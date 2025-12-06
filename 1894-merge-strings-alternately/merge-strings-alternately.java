class Solution {
    public String mergeAlternately(String word1, String word2) {
    
        StringBuilder merged = new StringBuilder();

        int len = Math.min(word1.length(), word2.length());
        for (int i=0; i<len; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() == len) {
            merged.append(word2.substring(len));
        } else {
            merged.append(word1.substring(len));
        }

        return merged.toString();
        

    }
}