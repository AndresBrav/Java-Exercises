package LeetCode.TwoSum;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {

            int j = i + 1;
            while (j < nums.length) {

                int a = nums[i];
                int b = nums[j];

                if (a + b == target) {
                    return new int[] { i, j };
                }

                // System.out.println(a + "........." + b);

                j += 1;
            }

            i += 1;
        }
        return new int[] { 0, 0 };
    }

    public static void main(String args[]) {
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;
        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] res = twoSum(nums, target);
        System.out.println(res[0] + "........." + res[1]);

    }
}
