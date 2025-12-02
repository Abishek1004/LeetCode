class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int len = s.length()-1;
        while(len >= 0){
            while(s.charAt(len) != ' '){
                res += 1; 
                if(len > 0) len--;
                else break;  
            }
            if(len > 0) len--;
            if(res > 0) return res;
        }
        return 0;
    }
}