class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        if(n>1)
        {
            for(int i=0;i<n;i++)
            {
                sum+=nums[i];
                max=sum>max? sum:max;
                if(sum<0)
                {
                    sum=0;
                }
            }
        }
        else{
            max=nums[0];
        }
        return max;
        
    }
}
