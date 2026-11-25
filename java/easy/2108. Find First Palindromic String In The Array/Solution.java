class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++){
            if (isPalindrome(words[i]) == true){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int pleft = 0;
        int pright = s.length()-1;
        while (pleft < pright){
            if (s.charAt(pleft) != s.charAt(pright)){
                return false;
            }
            pleft ++;
            pright--;
        }
        return true;
    }
}