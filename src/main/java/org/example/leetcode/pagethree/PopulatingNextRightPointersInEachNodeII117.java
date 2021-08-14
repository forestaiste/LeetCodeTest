package org.example.leetcode.pagethree;

import org.example.models.NodeWithNext;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII117 {
    public NodeWithNext connect(NodeWithNext root) {
        if (root == null)
            return null;

        Queue<NodeWithNext> queue = new LinkedList();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

//            NodeWithNext pre = null;

            for (int i = 0; i < size; i++) {
                NodeWithNext node = queue.poll();
//                if (i == size - 1) {
//                    node.next = null;
//                }
//
//                if (pre != null) {
//                    pre.next = node;
//                }
//
//                pre = node;
                if (i < size - 1) {
                    node.next = queue.peek();
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return root;
    }
}
