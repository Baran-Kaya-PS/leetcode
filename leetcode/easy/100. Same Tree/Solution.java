/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return vérification(p, q);
    }
    public boolean vérification(TreeNode p, TreeNode q) {

        if (p != null && q != null){
            if (p.val == q.val) {
                if (vérification(p.left, q.left) == false) {
                    return false;
                }
                if (vérification(p.right, q.right) == false) {
                    return false;
                }
                return true;
            }
        } else if (p == null && q == null ){
            return true;
        }
        return false;
    }
}