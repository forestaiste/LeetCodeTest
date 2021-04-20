package org.example;

import org.example.leetcode.pagetwelve.DeleteOperationForTwoStrings583;
import org.example.leetcode.pagetwelve.MaximumDepthOfNAryTree559;
import org.example.models.Node;
import org.junit.Test;

import java.util.Arrays;

public class PageTwelve {

    @Test
    public void deleteOperationForTwoStrings() {
        DeleteOperationForTwoStrings583 deleteOperationForTwoString = new DeleteOperationForTwoStrings583();
        System.out.println(deleteOperationForTwoString.minDistance("sea", "eat"));
    }

    @Test
    public void maximumDepthOfNAryTree559Test() {
        Node five = new Node(5);
        Node six = new Node(6);
        Node three = new Node(3, Arrays.stream(new Node[] {five, six}).toList());
        Node two = new Node(2);
        Node four = new Node(4);
        Node one = new Node(1, Arrays.stream(new Node[] {three, two, four}).toList());

        MaximumDepthOfNAryTree559 maximumDepthOfNAryTree = new MaximumDepthOfNAryTree559();
        System.out.println(maximumDepthOfNAryTree.maxDepth(one));
        System.out.println(maximumDepthOfNAryTree.maxDepth1(one));
    }
}
