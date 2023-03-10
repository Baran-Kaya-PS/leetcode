import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int nums : nums1) a.add(nums);
        for(int nums : nums2) a.add(nums);
        Collections.sort(a);
        int middle = (a.size()/2);
        if (a.size() % 2 != 0) return (double) a.get(middle);
        else {
            return (double)(a.get(middle) + a.get(middle-1))/2;
        }
    }
}