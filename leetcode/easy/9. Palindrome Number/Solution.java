class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        Integer y = x;
        String z = y.toString();
        StringBuilder compare = new StringBuilder();
        for (int i = z.length()-1; i != -1 ; i--){
            compare.append(z.charAt(i));
        }
        for (int i = z.length()-1; i > 0 ; i--){
            if (z.charAt(i) != compare.toString().charAt(i)) return false;
        }
        return true;
    }
}