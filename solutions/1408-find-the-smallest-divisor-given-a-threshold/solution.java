class Solution {
    public int check(int nums[],int mid)
    {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=Math.ceil((double)nums[i]/mid);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int high=max;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(check(nums,mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}
