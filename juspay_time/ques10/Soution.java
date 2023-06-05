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
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        if((root.right != null && minval(root.right) > root.val) && (root.left != null && maxval(root.left) < root.val)){
            
            return true;
        }else{
            return false;
        }
        
    }

    public int minval(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int left = minval(root.left);
        int right = minval(root.right);

        return Math.min(Math.min(left,right),root.val);
    }
    public int maxval(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int left = maxval(root.left);
        int right = maxval(root.right);

        return Math.max(Math.max(left,right),root.val);
    }
}
