    class Solution {
        public boolean isPalindrome(String s) {

            int i = 0;
            int j = s.length() - 1;
            
            while (i < j)
            {
                char left = s.charAt(i);
                char right = s.charAt(j);

                if (left >= 'A' && left <= 'Z')
                {
                    left = (char) (left + 32);
                }

                if (right >= 'A' && right <= 'Z')
                {
                    right = (char) (right + 32);
                }

                if (!isAlphanumeric(left)) {
                    i++;
                } 

                if (!isAlphanumeric(right)) {
                    j--;
                } 

                if (isAlphanumeric(left) && isAlphanumeric(right)){
                    if (left != right)
                    return false;

                    i++;
                    j--;
                }
            }

            return true;
        }

        public boolean isAlphanumeric(char a) {

            return (a >= 'a' && a <= 'z') || (a >= '0' && a <= '9');
        }
    }