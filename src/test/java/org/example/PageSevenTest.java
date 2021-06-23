package org.example;

import com.sun.source.tree.Tree;
import org.example.leetcode.pageseven.*;
import org.example.models.ListNode;
import org.example.models.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PageSevenTest {
    @Test
    public void reverseStringTest() {
        ReverseString344 reverseString = new ReverseString344();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(s);

        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString.reverseString(s1);
    }

    @Test
    public void intersectionOfTwoArrays349Test() {
        IntersectionOfTwoArrays349 intersection = new IntersectionOfTwoArrays349();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection.intersection0(nums1, nums2);
        System.out.println(Arrays.toString(result));
        System.out.println("----------------");
        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        result = intersection.intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }

    @Test
    public void topKFrequentElements347Test() {

        TopKFrequentElements347 topKFrequentElements = new TopKFrequentElements347();
//        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] nums = {4,1,-1,2,-1,2,3};
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(nums, 2)));
    }

    @Test
    public void reconstructItinerary332Test() {
        ReconstructItinerary332 reconstructItinerary = new ReconstructItinerary332();
        List<List<String>> tickets = new ArrayList<>();
        List<String> t1 = new ArrayList<>() {
            {
                add("JFK");
                add("SFO");
            }
        };
        List<String> t2 = new ArrayList<>() {
            {
                add("JFK");
                add("ATL");
            }
        };
        List<String> t3 = new ArrayList<>() {
            {
                add("SFO");
                add("ATL");
            }
        };
        List<String> t4 = new ArrayList<>() {
            {
                add("ATL");
                add("JFK");
            }
        };
        List<String> t5 = new ArrayList<>() {
            {
                add("ATL");
                add("SFO");
            }
        };
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);
        tickets.add(t5);

        System.out.println(Arrays.toString(reconstructItinerary.findItinerary(tickets).toArray()));

//        List<String> t1 = new ArrayList<>() {
//            {
//                add("MUC");
//                add("LHR");
//            }
//        };
//        List<String> t2 = new ArrayList<>() {
//            {
//                add("JFK");
//                add("MUC");
//            }
//        };
//        List<String> t3 = new ArrayList<String>() {
//            {
//                add("SFO");
//                add("SJC");
//            }
//        };
//        List<String> t4 = new ArrayList<String>() {
//            {
//                add("LHR");
//                add("SFO");
//            }
//        };
//
//        tickets.add(t1);
//        tickets.add(t2);
//        tickets.add(t3);
//        tickets.add(t4);
//
//        System.out.println(Arrays.toString(reconstructItinerary.findItinerary(tickets).toArray()));
    }

    @Test
    public void integerBreak343Test() {
        IntegerBreak343 integerBreak = new IntegerBreak343();

        System.out.println(integerBreak.integerBreak(10));
    }

    @Test
    public void coinChange322Test() {
        CoinChange322 coinChange = new CoinChange322();
        int[] coins = {1, 2, 5};
        System.out.println(coinChange.coinChange(coins, 11));

        coins = new int[]{2};
        System.out.println(coinChange.coinChange(coins, 3));
    }

    @Test
    public void houseRobberIII337Test() {
        HouseRobberIII337 houseRobberIII = new HouseRobberIII337();
        TreeNode leftLeaf = new TreeNode(1);
        TreeNode rightLeaf = new TreeNode(3);
        TreeNode left = new TreeNode(4, leftLeaf, rightLeaf);

        TreeNode rightLeaf2 = new TreeNode(1);
        TreeNode right = new TreeNode(5, null, rightLeaf2);

        TreeNode root = new TreeNode(3, left, right);
        System.out.println(houseRobberIII.rob(root));
    }

    @Test
    public void bestTimeToBuyAndSellStockWithCooldown309() {
        BestTimeToBuyAndSellStockWithCooldown309 bestTimeToBuyAndSellStockWithCooldown = new BestTimeToBuyAndSellStockWithCooldown309();
        int[] prices = {3, 3, 5, 1, 0, 3, 4, 5, 2, 8, 1};

        System.out.println(bestTimeToBuyAndSellStockWithCooldown.maxProfit(prices));
    }

    @Test
    public void additiveNumber306Test() {
        AdditiveNumber306 additiveNumber = new AdditiveNumber306();

        System.out.println(additiveNumber.isAdditiveNumber("121474836472147483648"));
        System.out.println(additiveNumber.isAdditiveNumber("211738"));
        System.out.println(additiveNumber.isAdditiveNumber("1203"));
        System.out.println(additiveNumber.isAdditiveNumber("199100199"));
        System.out.println(additiveNumber.isAdditiveNumber("1112358"));
    }

    @Test
    public void rangeSumQueryMutable307Test() {
        int[] nums = {1, 3, 5};
        RangeSumQueryMutable307 rangeSumQueryMutable = new RangeSumQueryMutable307(nums);

        System.out.println(rangeSumQueryMutable.sumRange(0, 2));
        rangeSumQueryMutable.update(1, 2);
        System.out.println(rangeSumQueryMutable.sumRange(0, 2));
    }

    @Test
    public void superUglyNumber313Test() {
        SuperUglyNumber313 superUglyNumber = new SuperUglyNumber313();
        int[] primes = {2,7,13,19};
        System.out.println(superUglyNumber.nthSuperUglyNumber(12, primes));
    }

    @Test
    public void removeDuplicateLetters316Test() {
        RemoveDuplicateLetters316 removeDuplicateLetters = new RemoveDuplicateLetters316();
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("bcabc"));
        System.out.println(removeDuplicateLetters.removeDuplicateLetters("cbacdcbc"));

    }

    @Test
    public void maximumProductOfWordLengths318Test() {
        MaximumProductOfWordLengths318 maximumProductOfWordLengths = new MaximumProductOfWordLengths318();
        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};

        System.out.println(maximumProductOfWordLengths.maxProduct(words));
    }

    @Test
    public void bulbSwitcher319Test() {
        BulbSwitcher319 bulbSwitcher = new BulbSwitcher319();
        System.out.println(bulbSwitcher.bulbSwitch(12));
    }

    @Test
    public void wiggleSortII324Test() {
        WiggleSortII324 wiggleSortII = new WiggleSortII324();
        int[] nums = {1,3,1,2,3,2};
        wiggleSortII.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void powerOfThree326Test() {
        PowerOfThree326 powerOfThree = new PowerOfThree326();

        System.out.println(powerOfThree.isPowerOfThree(27));
        System.out.println(powerOfThree.isPowerOfThree(0));
        System.out.println(powerOfThree.isPowerOfThree(9));
        System.out.println(powerOfThree.isPowerOfThree(45));
    }

    @Test
    public void oddEvenLinkedList328Test() {
        OddEvenLinkedList328 oddEvenLinkedList = new OddEvenLinkedList328();
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode result = oddEvenLinkedList.oddEvenList(first);
        do {
            System.out.println(result.val);
            result = result.next;
        } while (result != null);

    }
}
