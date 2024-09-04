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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSumHelper(root, targetSum);
    }
    
    private boolean hasPathSumHelper(TreeNode node, int targetSum) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return node.val == targetSum;
        
        int newTargetSum = targetSum - node.val;
        return hasPathSumHelper(node.left, newTargetSum) || hasPathSumHelper(node.right, newTargetSum);
    }
}
