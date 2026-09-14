class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++)
        {
            min=min>nums[i]? nums[i]:min;
            max=max<nums[i]? nums[i]:max;
        }
        return (long) (max-min)*k;
    }
}
