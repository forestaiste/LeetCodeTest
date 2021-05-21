package org.example.leetcode.pagethree;

//138. 复制带随机指针的链表
//        给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点。
//
//        构造这个链表的 深拷贝。 深拷贝应该正好由 n 个 全新 节点组成，其中每个新节点的值都设为其对应的原节点的值。新节点的 next 指针和 random 指针也都应指向复制链表中的新节点，并使原链表和复制链表中的这些指针能够表示相同的链表状态。复制链表中的指针都不应指向原链表中的节点 。
//
//        例如，如果原链表中有 X 和 Y 两个节点，其中 X.random --> Y 。那么在复制链表中对应的两个节点 x 和 y ，同样有 x.random --> y 。
//
//        返回复制链表的头节点。
//
//        用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
//
//        val：一个表示 Node.val 的整数。
//        random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
//        你的代码 只 接受原链表的头节点 head 作为传入参数。
//
//
//
//        示例 1：
//
//
//
//        输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//        输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
//        示例 2：
//
//
//
//        输入：head = [[1,1],[2,1]]
//        输出：[[1,1],[2,1]]
//        示例 3：
//
//
//
//        输入：head = [[3,null],[3,0],[3,null]]
//        输出：[[3,null],[3,0],[3,null]]
//        示例 4：
//
//        输入：head = []
//        输出：[]
//        解释：给定的链表为空（空指针），因此返回 null。


import org.example.models.RandomNode;

import java.util.HashMap;

public class CopyListWithRandomPointer138 {
    // HashMap which holds old nodes as keys and new nodes as its values.
    HashMap<RandomNode, RandomNode> visitedHash = new HashMap<>();

    public RandomNode copyRandomList(RandomNode head) {

        if (head == null) {
            return null;
        }

        // If we have already processed the current node, then we simply return the cloned version of
        // it.
        if (this.visitedHash.containsKey(head)) {
            return this.visitedHash.get(head);
        }

        // Create a new node with the value same as old node. (i.e. copy the node)
        RandomNode node = new RandomNode(head.val, null, null);

        // Save this value in the hash map. This is needed since there might be
        // loops during traversal due to randomness of random pointers and this would help us avoid
        // them.
        this.visitedHash.put(head, node);

        // Recursively copy the remaining linked list starting once from the next pointer and then from
        // the random pointer.
        // Thus we have two independent recursive calls.
        // Finally we update the next and random pointers for the new node created.
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);

        return node;
    }
}
