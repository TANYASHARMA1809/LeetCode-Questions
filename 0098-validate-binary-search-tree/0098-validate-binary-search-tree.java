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
        return helper(root).isBst;
    }
    public Bst helper(TreeNode root){
        if(root==null){
            return new Bst();
        }
        Bst l=helper(root.left);
        Bst r=helper(root.right);
        Bst self =new Bst();
        self.min=Math.min(root.val,Math.min(l.min,r.min));
        self.max=Math.max(root.val,Math.max(l.max,r.max));
        if(l.isBst && r.isBst && l.max<root.val && r.min>root.val){
            self.isBst=true;
        }else{
            self.isBst=false;
        }
        return self;
    }
    class Bst{
        boolean isBst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
}