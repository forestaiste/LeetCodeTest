package org.example.leetcode.pagetwo;

public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= farthest) {
                farthest = Math.max(i + nums[i], farthest);

                if (farthest >= nums.length - 1)
                    return true;
            }
        }

        return false;
    }
}
