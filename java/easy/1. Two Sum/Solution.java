class Solution {
    public int[] twoSum(int[] nums, int target) {
        int taille = nums.length;
        int [] réponse = new int[2];
        for (int i = 0;i < taille;i++) {
            for (int j = 0; j < taille; j++) {
                if (i != j) {
                    if(Math.abs(nums[i])<= Math.abs(target) || nums[j] <= Math.abs(target)) {
                        if (nums[i] + nums[j] == target) {
                            réponse[0]=j;
                            réponse[1]=i;
                        }
                    }
                }
            }
        }
        return réponse;
    }
}