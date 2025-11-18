class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){

            while(left < right && !checkChar(arr[left])){
                left++;
            }

            while(left < right && !checkChar(arr[right])){
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
    public Boolean checkChar(char s){
        s = Character.toLowerCase(s);
        return s=='a' || s=='e' || s=='i' || s=='o' || s=='u';
    }
}