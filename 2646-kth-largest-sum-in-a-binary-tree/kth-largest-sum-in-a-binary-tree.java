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
    public List<Long> levelorder(TreeNode root){
        ArrayList<Long> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        long x=0;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
               list.add(x);
                x=0;
             if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                x+=curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return list;
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list=levelorder(root);
        int x=list.size();
        Collections.sort(list,Collections.reverseOrder());
        if(k>x) return -1;
        return list.get(k-1);
    }
}