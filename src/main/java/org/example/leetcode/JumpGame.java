package org.example.leetcode;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= farthest) {
                farthest = Math.max(i + nums[i], farthest);

                if (farthest > nums.length - 1)
                    return true;
            }
        }

        return false;
    }
}
