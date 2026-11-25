
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        HashSet hset = new HashSet();
        while (j < s.length()) {
            if (!hset.contains(s.charAt(j))) {
                hset.add(s.charAt(j));
                j++;
                max = Math.max(max, hset.size());
            } else {
                hset.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}