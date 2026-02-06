import java.util.*;

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxKeep = 1;

        for (int i = 0; i < n; i++) {
            long limit = (long) nums[i] * k;
            int left = i, right = n - 1, best = i;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] <= limit) {
                    best = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            maxKeep = Math.max(maxKeep, best - i + 1);
        }

        return n - maxKeep;
    }
}
