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
 public class balance{
    boolean isBalance=true;
    int ht=-1;
 }
class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root).isBalance;
        
    }
    public balance helper(TreeNode root){
        if(root==null){
            return new balance();
        }
        balance l=helper(root.left);
        balance r=helper(root.right);
        balance sb=new balance();
        sb.ht=Math.max(l.ht,r.ht)+1;
        int b=Math.abs(l.ht-r.ht);
        sb.isBalance=l.isBalance && r.isBalance && b<=1;
        return sb;
        
    }
}