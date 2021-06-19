package org.example.leetcode.pageseven;

//307. 区域和检索 - 数组可修改
//        给你一个数组 nums ，请你完成两类查询，其中一类查询要求更新数组下标对应的值，另一类查询要求返回数组中某个范围内元素的总和。
//
//        实现 NumArray 类：
//
//        NumArray(int[] nums) 用整数数组 nums 初始化对象
//        void update(int index, int val) 将 nums[index] 的值更新为 val
//        int sumRange(int left, int right) 返回子数组 nums[left, right] 的总和（即，nums[left] + nums[left + 1], ..., nums[right]）
//
//        示例：
//
//        输入：
//        ["NumArray", "sumRange", "update", "sumRange"]
//        [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
//        输出：
//        [null, 9, null, 8]
//
//        解释：
//        NumArray numArray = new NumArray([1, 3, 5]);
//        numArray.sumRange(0, 2); // 返回 9 ，sum([1,3,5]) = 9
//        numArray.update(1, 2);   // nums = [1,2,5]
//        numArray.sumRange(0, 2); // 返回 8 ，sum([1,2,5]) = 8

public class RangeSumQueryMutable307 {

    int[] tree;
    int n;
    public RangeSumQueryMutable307(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            tree = new int[n * 2];
            buildTree(nums);
        }
    }
    private void buildTree(int[] nums) {
        for (int i = n, j = 0;  i < 2 * n; i++,  j++)
            tree[i] = nums[j];
        for (int i = n - 1; i > 0; --i)
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
    }

    public void update(int pos, int val) {
        pos += n;
        tree[pos] = val;
        while (pos > 0) {
            int left = pos;
            int right = pos;
            if (pos % 2 == 0) {
                right = pos + 1;
            } else {
                left = pos - 1;
            }
            // parent is updated after child is updated
            tree[pos / 2] = tree[left] + tree[right];
            pos /= 2;
        }
    }

    public int sumRange(int l, int r) {
        // get leaf with value 'l'
        l += n;
        // get leaf with value 'r'
        r += n;
        int sum = 0;
        while (l <= r) {
            if ((l % 2) == 1) {
                sum += tree[l];
                l++;
            }
            if ((r % 2) == 0) {
                sum += tree[r];
                r--;
            }
            l /= 2;
            r /= 2;
        }
        return sum;
    }


//    int[] sum;
//    int[] nums;
//    int length;
//    public RangeSumQueryMutable307A(int[] nums) {
//        length = nums.length;
//        sum = new int[length + 1];
//        this.nums = nums;
//
//        for (int i = 1; i <= length; i++) {
//            sum[i] = sum[i - 1] + nums[i - 1];
//        }
//    }
//
//    public void updateA(int index, int val) {
//        int preVal = nums[index];
//        nums[index] = val;
//
//        int result = val - preVal;
//        for (int i = index + 1; i <= length; i++) {
//            sum[i] += result;
//        }
//    }
//
//    public int sumRangeA(int left, int right) {
//        return sum[right + 1] - sum[left];
//    }
}
