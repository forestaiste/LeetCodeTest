package org.example.leetcode.pagefive;

//228. 汇总区间
//        给定一个无重复元素的有序整数数组 nums 。
//
//        返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
//
//        列表中的每个区间范围 [a,b] 应该按如下格式输出：
//
//        "a->b" ，如果 a != b
//        "a" ，如果 a == b
//
//        示例 1：
//
//        输入：nums = [0,1,2,4,5,7]
//        输出：["0->2","4->5","7"]
//        解释：区间范围是：
//        [0,2] --> "0->2"
//        [4,5] --> "4->5"
//        [7,7] --> "7"
//        示例 2：
//
//        输入：nums = [0,2,3,4,6,8,9]
//        输出：["0","2->4","6","8->9"]
//        解释：区间范围是：
//        [0,0] --> "0"
//        [2,4] --> "2->4"
//        [6,6] --> "6"
//        [8,9] --> "8->9"
//        示例 3：
//
//        输入：nums = []
//        输出：[]
//        示例 4：
//
//        输入：nums = [-1]
//        输出：["-1"]
//        示例 5：
//
//        输入：nums = [0]
//        输出：["0"]

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(Integer.toString(nums[high]));
            }
            ret.add(temp.toString());
        }
        return ret;
    }


    public List<String> summaryRanges1(int[] nums) {
        int length = nums.length;
        List<String> result = new ArrayList<>();

        if (length == 0)
            return result;

        Integer start = nums[0];

        if (length == 1) {
            result.add(start.toString());
            return result;
        }

        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start != nums[i - 1]) {
                    String s = start + "->" + nums[i - 1];
                    result.add(s);
                }
                else {
                    result.add(start.toString());
                }

                start = nums[i];
            }

            if (i == length - 1) {
                if (nums[i] == nums[i - 1] + 1) {
                    String s = start + "->" + nums[i];
                    result.add(s);
                }
                else {
                    result.add(start.toString());
                }
            }
        }

        return result;
    }
}
