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
        long totalS = 0;
        long maxP = 0;
        int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {
            totalS = TotalSum(root);
            SubtreeSum(root);
            return (int)(maxP % MOD);
        }
        long TotalSum(TreeNode node){
            if(node == null) return 0;
            return node.val + TotalSum(node.left) + TotalSum(node.right);
        }
        long SubtreeSum (TreeNode node){
            if(node == null) return 0;
            long left = SubtreeSum(node.left);
            long right = SubtreeSum(node.right);
            long subSum = left + right + node.val;

            long Pro = (totalS- subSum) * subSum;
            maxP = Math.max(maxP, Pro);
            return subSum;
    }
}