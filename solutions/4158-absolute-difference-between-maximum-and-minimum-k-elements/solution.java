class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int largesum=0;
        int smallsum=0;
        int t=k;
        for(int i=0;i<k;i++)
        {
            smallsum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(t==0)
            {
                break;
            }
            largesum+=nums[i];
            t--;
        }
        return largesum-smallsum;
    }
}
