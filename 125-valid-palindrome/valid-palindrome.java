class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String result = "";
        for(int i=cleaned.length()-1;i>=0;i--){
            result+=cleaned.charAt(i);
        }
        System.out.print(cleaned);
        return cleaned.equals(result);
    }
}