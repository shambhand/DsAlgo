package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement : https://leetcode.com/problems/two-sum
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
