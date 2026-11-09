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
    ArrayList<List<Integer>> list=new ArrayList<>();
    ArrayList<Integer> inner=new ArrayList<>();
    public void zigzag(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        int i=2;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                i++;
                list.add(List.copyOf(inner));
                inner.clear();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                inner.add(curr.val);
          
                     if(curr.left!=null){
                    q.add(curr.left);
                     }
                    if(curr.right!=null){
                    q.add(curr.right);
                }
 }
    }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zigzag(root);
        int x=list.size();
        for(int i = 0; i < x; i++) {
        if(i % 2 != 0) {
        List<Integer> temp = new ArrayList<>(list.get(i));
        Collections.reverse(temp);
        list.set(i, temp);
    }
}
        return list;
    }

}