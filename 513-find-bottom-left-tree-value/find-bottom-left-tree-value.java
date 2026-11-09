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
    int data;
    public void levelorder(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    data=q.peek().val;
                    q.add(null);
                }
            }else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        levelorder(root);
        return data;
    }
}