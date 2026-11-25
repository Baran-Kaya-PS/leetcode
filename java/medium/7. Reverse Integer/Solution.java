class Solution {
    public int reverse(int x) {

        String reverse = new String("");
        String X = String.valueOf(x);
        if (x < 0) {
            reverse += "-";
            for (int i = X.length(); i > 1; i--) {
                reverse += X.charAt(i - 1);
            }
        } else {
            for (int i = X.length(); i > 0; i--) {
                reverse += X.charAt(i - 1);
            }
        }
        long y = Long.valueOf(reverse);

        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){return 0;}
        return (int) y;
    }
}