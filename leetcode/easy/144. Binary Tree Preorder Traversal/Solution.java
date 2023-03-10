import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList list = new LinkedList<Integer>();
        order(root, list);
        return list;
    }

    public void order(TreeNode root, List list) {
        if (root == null) return;
        list.add(root.val);
        order(root.left,list);
        order(root.right,list);
    }
}


