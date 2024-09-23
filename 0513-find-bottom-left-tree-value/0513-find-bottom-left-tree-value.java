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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<List<Integer>> ans=new ArrayList<>();
        helper(root,ans);
        List<Integer> ll=ans.get(ans.size()-1);
        return ll.get(0);
        
    }
    public void helper(TreeNode root,List<List<Integer>> ans){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode rv=q.remove();
                if(rv.left!=null){
                    q.add(rv.left);
                }
                if(rv.right!=null){
                    q.add(rv.right);
                }
                ll.add(rv.val);

            }
            ans.add(ll);
        }
    }
}