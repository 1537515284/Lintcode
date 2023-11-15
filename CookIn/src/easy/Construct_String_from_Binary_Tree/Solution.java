package easy.Construct_String_from_Binary_Tree;

public class Solution {
    /**
     * @param t: the root of tree
     * @return: return a string
     */
    public String tree2str(TreeNode t) {
        // write your code
        StringBuilder sb = new StringBuilder();
        traverse(t, sb);
        return sb.toString();
    }

    public void traverse(TreeNode t, StringBuilder sb) {
        if (t == null) {
            return;
        }
        sb.append(t.val);
    
        if (t.left != null || t.right != null) {
            sb.append("(");
            traverse(t.left, sb);
            sb.append(")");
        }
    
        if (t.right != null) {
            sb.append("(");
            traverse(t.right, sb);
            sb.append(")");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        root.left = node2;
        root.right = node3;
        node2.right = node4;
        Solution solution = new Solution();
        String tree2str = solution.tree2str(root);
        System.out.println(tree2str);
    }
}
