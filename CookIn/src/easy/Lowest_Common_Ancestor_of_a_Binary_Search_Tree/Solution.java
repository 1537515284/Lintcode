package easy.Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {
    /**
     * @param root: root of the tree
     * @param p: the node p
     * @param q: the node q
     * @return: find the LCA of p and q
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // write your code here
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }

    public static void main(String[] args) {
        int[] treeNums = {6,2,8,0,4,7,9,Integer.MIN_VALUE,Integer.MIN_VALUE,3,5};
        TreeNode root = TreeNode.buildTree(treeNums);
        Solution solution = new Solution();
        TreeNode p = root.left.left;
        TreeNode q = root.left.right;
        TreeNode lowestCommonAncestor = solution.lowestCommonAncestor(root, p, q);
        System.out.println(lowestCommonAncestor.val);
    }
}
