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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //not identical cases 
        // if either one(p,q) null or not equeal then return false 
        
        //for exaple 1:
        // you can dry and run the code
        if(p==null && q==null)
             return true;
        else if((p==null || q==null) ||(p.val!=q.val))
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
    }
}
