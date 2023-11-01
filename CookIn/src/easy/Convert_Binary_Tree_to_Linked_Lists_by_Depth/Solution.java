package easy.Convert_Binary_Tree_to_Linked_Lists_by_Depth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    /**
     * @param root the root of binary tree
     * @return a lists of linked list
     */
    public List<ListNode> binaryTreeToLists_(TreeNode root) {
        // Write your code here
        List<ListNode> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelCnt = queue.size();
            ListNode listNode = null;
            ListNode p = listNode;
            for (int i = 0; i < levelCnt; i++) {
                TreeNode node = queue.poll();
                // create list node
                if (i == 0) {
                    listNode = new ListNode(node.val);
                    p = listNode;
                } else {
                    p.next = new ListNode(node.val);
                    p = p.next;
                }
                // add left & right children to queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            ans.add(listNode);
        }
        return ans;
    }

    // Improved
    public List<ListNode> binaryTreeToLists(TreeNode root) {
        List<ListNode> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        queue.offer(root);
        queue.offer(null); // 添加特殊标记
        ListNode listNode = null;
        ListNode p = listNode;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) { // 遇到特殊标记，表示该层结束
                ans.add(listNode);
                if (!queue.isEmpty()) {
                    queue.offer(null); // 添加下一层的特殊标记
                }
                listNode = null;
                p = null;
                continue;
            }
            // 创建链表节点
            if (listNode == null) {
                listNode = new ListNode(node.val);
                p = listNode;
            } else {
                p.next = new ListNode(node.val);
                p = p.next;
            }
            // 添加左右子节点到队列
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        Solution solution = new Solution();
        List<ListNode> listNodes = solution.binaryTreeToLists(root);
        for (ListNode listNode : listNodes) {
            ListNode p = listNode;
            while (p != null){
                System.out.print(p.val + ",");
                p = p.next;
            }
            System.out.println();
        }
    }
}
