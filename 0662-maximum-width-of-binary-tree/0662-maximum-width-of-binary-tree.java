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
    // with DFS had to iterate twice, one iteration 
    // for adding the nodes ot a map with depth as key and 
    // another for calculating diff

    // with BFS both can be done in a single iteration
    // left child index = 2*index + 1
    // for each level, min index is at start and max at end, 
    // find diff and compare with max
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int diff = 0;

        Deque<Node> q = new LinkedList<>();
        q.addLast(new Node(root, 0)); // Node class for storing index

        while(q.size() != 0){
            int size = q.size();
            int min = 0, max = 0;
            for(int s = 0; s<size; s++){
                Node curr = q.removeFirst();
                if(s == 0) min = curr.index;
                if(s == size-1) max = curr.index;

                if(curr.node.left != null) 
                    q.addLast(new Node(curr.node.left, 2*curr.index +1));
                if(curr.node.right != null) 
                    q.addLast(new Node(curr.node.right, 2*curr.index +2));
            }

            diff = Math.max(diff, max - min + 1); // +1 for including the last node
        }

        return diff; 
    }
}

class Node{
    TreeNode node;
    int index;
    Node(TreeNode n, int i){
        this.node = n;
        this.index = i;
    }
}