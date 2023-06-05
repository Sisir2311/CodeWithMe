/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // root.left = isSymmetric(root.left);
        // root.right = isSymmetric(root.right);
        // if(root.left == root.right)
        if(root == null){
            return true;
        }
        return isTrue(root.left,root.right);
    }
    public boolean isTrue(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) ||(p  != null && q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isTrue(p.left,q.right) && isTrue(p.right,q.left);
    }
}
