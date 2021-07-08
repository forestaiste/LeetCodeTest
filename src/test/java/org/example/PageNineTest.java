package org.example;

import com.sun.source.tree.Tree;
import org.example.leetcode.pagenine.*;
import org.example.models.Node;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageNineTest {
    @Test
    public void queueReconstructionByHeight406Test() {
        QueueReconstructionByHeight406 queueReconstructionByHeight = new QueueReconstructionByHeight406();
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        people = queueReconstructionByHeight.reconstructQueue(people);

        for (int[] p : people) {
            System.out.println(Arrays.toString(p));
        }

        people = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        people = queueReconstructionByHeight.reconstructQueue(people);

        for (int[] p : people) {
            System.out.println(Arrays.toString(p));
        }
    }

    @Test
    public void nonOverlappingIntervals435Test() {
        NonOverlappingIntervals435 nonOverlappingIntervals = new NonOverlappingIntervals435();
        int[][] intervals = { {1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println(nonOverlappingIntervals.eraseOverlapIntervals(intervals));
    }

    @Test
    public void partitionEqualSubsetSum416Test() {
        PartitionEqualSubsetSum416 partitionEqualSubsetSum = new PartitionEqualSubsetSum416();
//        int[] nums = {1, 5, 11, 5};
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(partitionEqualSubsetSum.canPartition(nums));
    }

    @Test
    public void naryTreeLevelOrderTraversal429Test() {
        Node five = new Node(5);
        Node six = new Node(6);
        Node three = new Node(3, Arrays.stream(new Node[] {five, six}).toList());
        Node two = new Node(2);
        Node four = new Node(4);
        Node one = new Node(1, Arrays.stream(new Node[] {three, two, four}).toList());
        NaryTreeLevelOrderTraversal429 naryTreeLevelOrderTraversal = new NaryTreeLevelOrderTraversal429();

        List<List<Integer>> results = naryTreeLevelOrderTraversal.levelOrder(one);
        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void sumOfLeftLeaves404Test() {
        TreeNode rightLeft = new TreeNode(15);

        TreeNode rightRight = new TreeNode(7);

        TreeNode right = new TreeNode(20, rightLeft, rightRight);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        SumOfLeftLeaves404 sumOfLeftLeaves = new SumOfLeftLeaves404();
        System.out.println(sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void deleteNodeInABST450Test() {
        TreeNode rightLeft = new TreeNode(1);

        TreeNode rightRight = new TreeNode(2, rightLeft, null);

        TreeNode right = new TreeNode(4);

        TreeNode left = new TreeNode(0, null, rightRight);

        TreeNode root = new TreeNode(3, left, right);


        DeleteNodeInABST450 deleteNodeInABST = new DeleteNodeInABST450();
        deleteNodeInABST.deleteNode1(root, 0);
    }
}
