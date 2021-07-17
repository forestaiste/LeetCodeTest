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

    public static void main(String[] args) {
        JumpGame55 jumpGame = new JumpGame55();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGame.canJump(nums));
        nums = new int[] {3, 2, 1, 0, 4};
        System.out.println(jumpGame.canJump(nums));
    }
}
