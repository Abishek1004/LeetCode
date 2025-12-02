class Solution {
    public int lengthOfLastWord(String s) {
        String trimedFunction = s.trim();
        int len=0;
        for (int i = 0; i < trimedFunction.length(); i++) {
            if (trimedFunction.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
        return len;

    }
}