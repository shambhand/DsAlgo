package easy;

/**
 * Problem Statement : https://leetcode.com/problems/two-sum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i, j, sum = 0;
        boolean meet = false;
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    meet = true;
                    break;
                }
            }
            if (meet) {
                result[0] = i;
                result[1] = j;
                break;
            }
        }
        return result;
    }
}
