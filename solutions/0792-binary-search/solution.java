class Solution {
    public int search(int[] nums, int target) {
        int k=target;
        int l=0;
        int r=nums.length-1;
       while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==k)
            {
                return mid;
            }
            if(nums[mid]<k)
            {
                l=mid+1;
            }
            if(nums[mid]>k)
            {
                r=mid-1;
            }
        }    
        return -1;
    }
}
