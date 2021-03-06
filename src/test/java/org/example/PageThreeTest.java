package org.example;

import com.sun.source.tree.Tree;
import org.example.leetcode.pagethree.*;
import org.example.models.ListNode;
import org.example.models.Node;
import org.example.models.NodeWithNext;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageThreeTest {
    @Test
    public void linkedListCycleIITest() {
        ListNode fourth = new ListNode(-4);
        ListNode third = new ListNode(0, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(3, second);
        fourth.next = second;

        LinkedListCycleII142 linkedListCycleII = new LinkedListCycleII142();
        ListNode result = linkedListCycleII.detectCycle(first);
        System.out.println(result.val);
    }

    @Test
    public void palindromePartitioning131Test() {
        PalindromePartitioning131 palindromePartitioning = new PalindromePartitioning131();
        String r = "smiles".substring(1, 6);
        List<List<String>> results = palindromePartitioning.partition("aab");

        for (List<String> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void bestTimeToBuyAndSellStockII122Test() {
        BestTimeToBuyAndSellStockII122 bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII122();
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit2(prices));
        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
        prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
        prices = new int[]{2, 1, 2, 0, 1};
        System.out.println(bestTimeToBuyAndSellStockII.maxProfit1(prices));
    }

    @Test
    public void gasStation134Test() {
        GasStation134 gasStation = new GasStation134();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));

        gas = new int[]{5, 8, 2, 8};
        cost = new int[]{6, 5, 6, 6};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void candy135Test() {
        Candy135 candy = new Candy135();
        int[] ratings = {2, 1, 1, 0, 2, 0, 1, 2};
        System.out.println(candy.candy(ratings));
    }

    @Test
    public void wordBreak139Test() {
        WordBreak139 wordBreak = new WordBreak139();
        List<String> wordDict = Arrays.asList("apple", "pen");
        System.out.println(wordBreak.wordBreak("applepenapple", wordDict));

        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak.wordBreak("catsandog", wordDict));

        wordDict = Arrays.asList("leet", "code");
        System.out.println(wordBreak.wordBreak("leetcode", wordDict));
    }

    @Test
    public void bestTimeToBuyAndSellStock121Test() {
        BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock121();
        int[] prices = {2, 1, 2, 0, 1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit3(prices));

        prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit2(prices));

        prices = new int[]{7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit3(prices));
    }

    @Test
    public void bestTimeToBuyAndSellStockIII123Test() {
        BestTimeToBuyAndSellStockIII123 bestTimeToBuyAndSellStockIII = new BestTimeToBuyAndSellStockIII123();
        int[] prices = {3, 3, 5, 1, 0, 3, 4, 5, 2, 8};

        System.out.println(bestTimeToBuyAndSellStockIII.maxProfit(prices));
    }

    @Test
    public void distinctSubsequences115Test() {
        DistinctSubsequences115 distinctSubsequences = new DistinctSubsequences115();
        System.out.println(distinctSubsequences.numDistinct("babgbag", "bag"));
    }

    @Test
    public void binaryTreeLevelOrderTraversal102Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        BinaryTreeLevelOrderTraversal102 binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal102();
        List<List<Integer>> results = binaryTreeLevelOrderTraversal.levelOrder(root);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void binaryTreeLevelOrderTraversalII107Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        BinaryTreeLevelOrderTraversalII107 binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII107();
        List<List<Integer>> results = binaryTreeLevelOrderTraversalII.levelOrderBottom(root);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void symmetricTree101Test() {
        TreeNode rightLeftLeaf = new TreeNode(15);
        TreeNode rightRightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(5, rightLeftLeaf, rightRightLeaf);
//        TreeNode right = new TreeNode(4);

        TreeNode leftLeftLeaf = new TreeNode(7);
        TreeNode leftRightLeaf = new TreeNode(15);
        TreeNode left = new TreeNode(5, leftLeftLeaf, leftRightLeaf);
//        TreeNode left = new TreeNode(5);

        TreeNode root = new TreeNode(3, left, right);

        SymmetricTree101 symmetricTree = new SymmetricTree101();
        System.out.println(symmetricTree.isSymmetric(root));

        System.out.println(symmetricTree.isSymmetric1(root));
    }

    @Test
    public void maximumDepthOfBinaryTree104Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, left, right);

        MaximumDepthOfBinaryTree104 maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree104();
        System.out.println(maximumDepthOfBinaryTree.maxDepth(root));
        System.out.println(maximumDepthOfBinaryTree.maxDepth1(root));
    }

    @Test
    public void minimumDepthOfBinaryTree111Test() {
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, null, right);

        MinimumDepthOfBinaryTree111 minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree111();
        System.out.println(minimumDepthOfBinaryTree.minDepth(root));
        System.out.println(minimumDepthOfBinaryTree.minDepth1(root));
        System.out.println(minimumDepthOfBinaryTree.minDepth2(root));
    }

    @Test
    public void balancedBinaryTree110Test() {
        TreeNode ten = new TreeNode(10);
        TreeNode eight = new TreeNode(8, null, null);
        TreeNode nine = new TreeNode(9);
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7, eight, nine);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(9);

        TreeNode root = new TreeNode(3, null, right);

        BalancedBinaryTree110 balancedBinaryTree = new BalancedBinaryTree110();
        System.out.println(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void pathSum112Test() {
        TreeNode ten = new TreeNode(10);
        TreeNode eight = new TreeNode(8, ten, null);
        TreeNode nine = new TreeNode(9);
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7, eight, nine);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(2);

        TreeNode root = new TreeNode(1, left, null);

        PathSum112 pathSum = new PathSum112();
        System.out.println(pathSum.hasPathSum(root, 1));
    }

    @Test
    public void pathSumII113Test() {
        TreeNode ten = new TreeNode(10);
        TreeNode eight = new TreeNode(8, ten, null);
        TreeNode nine = new TreeNode(9);
        TreeNode leftLeaf = new TreeNode(15);
        TreeNode rightLeaf = new TreeNode(7, eight, nine);
        TreeNode right = new TreeNode(20, leftLeaf, rightLeaf);

        TreeNode left = new TreeNode(2);

        TreeNode root = new TreeNode(1, left, right);

        PathSumII113 pathSumII = new PathSumII113();
        List<List<Integer>> results = pathSumII.pathSum(root, 46);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void constructBinaryTreeFromInorderAndPostorderTraversal106Test() {
        ConstructBinaryTreeFromInorderAndPostorderTraversal106 constructBinaryTreeFromInorderAndPostorderTraversal
                = new ConstructBinaryTreeFromInorderAndPostorderTraversal106();
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);
    }

    @Test
    public void constructBinaryTreeFromPreorderAndInorderTraversal105Test() {
        ConstructBinaryTreeFromPreorderAndInorderTraversal105 constructBinaryTreeFromPreorderAndInorderTraversal
                = new ConstructBinaryTreeFromPreorderAndInorderTraversal105();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);
    }

    @Test
    public void convertSortedArrayToBinarySearchTree108Test() {
        ConvertSortedArrayToBinarySearchTree108 convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree108();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
    }

    @Test
    public void binaryTreeZigzagLevelOrderTraversal103Test() {
        BinaryTreeZigzagLevelOrderTraversal103 binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal103();

        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9);
        TreeNode root = new TreeNode(3, nine, twenty);

        List<List<Integer>> results = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        for (List<Integer> r : results) {
            System.out.println(Arrays.toString(r.toArray()));
        }
    }

    @Test
    public void convertSortedListToBinarySearchTree109Test() {
        ConvertSortedListToBinarySearchTree109 convertSortedListToBinarySearchTree = new ConvertSortedListToBinarySearchTree109();

        ListNode nine = new ListNode(9);
        ListNode five = new ListNode(5, nine);
        ListNode zero = new ListNode(0, five);
        ListNode negThree = new ListNode(-3, zero);
        ListNode negTen = new ListNode(-10, negThree);

        convertSortedListToBinarySearchTree.sortedListToBST1(negTen);
    }

    @Test
    public void flattenBinaryTreeToLinkedList114Test() {
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2, three, four);

        TreeNode six = new TreeNode(6);
        TreeNode five = new TreeNode(5, null, six);

        TreeNode one = new TreeNode(1, two, five);

        FlattenBinaryTreeToLinkedList114 flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList114();
        flattenBinaryTreeToLinkedList.flatten1(one);
    }

    @Test
    public void populatingNextRightPointersInEachNode116Test() {
        NodeWithNext four = new NodeWithNext(4);
        NodeWithNext five = new NodeWithNext(5);
        NodeWithNext two = new NodeWithNext(2, four, five, null);

        NodeWithNext six = new NodeWithNext(6);
        NodeWithNext seven = new NodeWithNext(7);
        NodeWithNext three = new NodeWithNext(3, six, seven, null);

        NodeWithNext one = new NodeWithNext(1, two, three, null);

        PopulatingNextRightPointersInEachNode116 populatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode116();

        populatingNextRightPointersInEachNode.connect(one);
    }

    @Test
    public void pascalsTriangle118Test() {
        PascalsTriangle118 pascalsTriangle = new PascalsTriangle118();

        List<List<Integer>> results = pascalsTriangle.generate(5);

        for (List<Integer> result : results) {
            System.out.println(Arrays.toString(result.toArray()));
        }
    }

    @Test
    public void pascalsTriangleII119Test() {
        PascalsTriangleII119 pascalsTriangleII = new PascalsTriangleII119();
        List<Integer> result = pascalsTriangleII.getRow(0);

        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void triangle120Test() {
        Triangle120 triangle = new Triangle120();

        List<Integer> row0 = Arrays.asList(-1);
        List<Integer> row1 = Arrays.asList(2, 3);
        List<Integer> row2 = Arrays.asList(1, -1, -3);
        List<List<Integer>> triangleData = new ArrayList<>(){
                {
                    add(row0);
                    add(row1);
                    add(row2);
                }
        };

//        List<Integer> row0 = Arrays.asList(2);
//        List<Integer> row1 = Arrays.asList(3, 4);
//        List<Integer> row2 = Arrays.asList(6, 5, 7);
//        List<Integer> row3 = Arrays.asList(4, 1, 8, 3);
//        List<List<Integer>> triangleData = new ArrayList<>(){
//            {
//                add(row0);
//                add(row1);
//                add(row2);
//                add(row3);
//            }
//        };


        System.out.println(triangle.minimumTotal(triangleData));
    }

    @Test
    public void validPalindrome125Test() {
        ValidPalindrome125 validPalindrome = new ValidPalindrome125();
        System.out.println(validPalindrome.isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome.isPalindrome1("race a car"));
        System.out.println(validPalindrome.isPalindrome1(" "));
        System.out.println(validPalindrome.isPalindrome1(".,"));
    }

    @Test
    public void sumRootToLeafNumbers129Test() {
        SumRootToLeafNumbers129 sumRootToLeafNumbers = new SumRootToLeafNumbers129();
        TreeNode five = new TreeNode(5);
        TreeNode one = new TreeNode(1);
        TreeNode nine = new TreeNode(9, five, one);
        TreeNode zero = new TreeNode(0);
        TreeNode root = new TreeNode(4, nine, zero);
        System.out.println(sumRootToLeafNumbers.sumNumbers(root));
    }

    @Test
    public void surroundedRegions130Test() {
        SurroundedRegions130 surroundedRegions = new SurroundedRegions130();
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        surroundedRegions.solve(board);

        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    @Test
    public void SingleNumber136Test() {
        SingleNumber136 singleNumber = new SingleNumber136();

        System.out.println(singleNumber.singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void linkedListCycleTest() {
        LinkedListCycle141 linkedListCycle = new LinkedListCycle141();

        ListNode fourth = new ListNode(-4);
        ListNode third = new ListNode(0, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(3, second);
        fourth.next = second;

        System.out.println(linkedListCycle.hasCycle(first));

        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        two.next = one;

        System.out.println(linkedListCycle.hasCycle(two));
    }

    @Test
    public void reorderList143Test() {
        ReorderList143 reorderList = new ReorderList143();

//        ListNode fifth = new ListNode(5);
//        ListNode fourth = new ListNode(4, fifth);
        ListNode fourth = new ListNode(4);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        reorderList.reorderList(first);

        ListNode node = first;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void binaryTreePreorderTraversal144Test() {
        BinaryTreePreorderTraversal144 binaryTreePreorderTraversal = new BinaryTreePreorderTraversal144();

        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode one = new TreeNode(1, null, two);
        List<Integer> result = binaryTreePreorderTraversal.preorderTraversal(one);

        System.out.println(Arrays.toString(result.toArray()));
    }

    @Test
    public void LRUCache146Test() {
        LRUCache146 lruCache = new LRUCache146(2);
        System.out.println(lruCache.get(2));
        lruCache.put(2, 6);
        System.out.println(lruCache.get(1));
        lruCache.put(1, 5);
        lruCache.put(1, 2);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }

    @Test
    public void insertionSortList147Test() {
        InsertionSortList147 insertionSortList = new InsertionSortList147();

        ListNode eighth = new ListNode(4);
        ListNode seventh = new ListNode(2, eighth);
        ListNode sixth = new ListNode(7, seventh);
        ListNode fifth = new ListNode(8, sixth);
        ListNode fourth = new ListNode(1, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(5, third);
        ListNode first = new ListNode(6, second);

        ListNode result = insertionSortList.insertionSortList(first);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void sortList148Test() {
        SortList148 sortList = new SortList148();

        ListNode eighth = new ListNode(4);
        ListNode seventh = new ListNode(2, eighth);
        ListNode sixth = new ListNode(7, seventh);
        ListNode fifth = new ListNode(8, sixth);
        ListNode fourth = new ListNode(1, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(5, third);
        ListNode first = new ListNode(6, second);

        ListNode result = sortList.sortList(first);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
