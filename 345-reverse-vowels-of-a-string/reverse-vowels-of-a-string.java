class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !checkChar(s.charAt(left))){
                left++;
            }

            while(left < right && !checkChar(s.charAt(right))){
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
        return new String(arr);
    }
    public static boolean checkChar(char ts){
        char t=Character.toLowerCase(ts);
        return t=='a' || t=='e' || t=='i' || t=='o' || t=='u';
    }
}