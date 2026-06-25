class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int totalSubarrays = 0;
        int n = nums.length;

        // Iterate through every possible starting point
        for (int i = 0; i < n; i++) {
            int targetCount = 0;
            
            // Expand the subarray to the right
            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    targetCount++;
                }
                
                int length = j - i + 1;
                // Condition for majority element: strictly more than half
                if (targetCount > length / 2) {
                    totalSubarrays++;
                }
            }
        }

        return totalSubarrays;
    }
}
