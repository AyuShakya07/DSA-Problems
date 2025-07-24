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
    TreeNode prev=null;
    TreeNode fst=null;
    TreeNode lst=null;
    public void recoverTree(TreeNode root) {
        find(root);
        int temp=fst.val;
        fst.val=lst.val;
        lst.val=temp;
    }
    private void find(TreeNode root){
        if(root==null) return;

        find(root.left);
        if(prev!=null && prev.val > root.val){
            if(fst==null){
                fst=prev;
                lst=root;
            }else{
                lst=root;
            }
        }
        prev=root;
        find(root.right);
    }

}