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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);
        boolean isFrwd = true;
        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> levelArr = new LinkedList<>();

            while(level-- > 0){
                TreeNode node = que.poll();
                if(isFrwd) levelArr.addLast(node.val);
                else levelArr.addFirst(node.val);

                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
            ans.add(levelArr);
            isFrwd = !isFrwd;
        }
        return ans;
    }
}