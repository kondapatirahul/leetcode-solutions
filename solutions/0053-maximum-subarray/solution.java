class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<n;i++)
        {
            current+=nums[i];
            max=max>current? max:current;
            if(current<0)
            {
                current=0;
            }
        }
        return max;
    }
}
