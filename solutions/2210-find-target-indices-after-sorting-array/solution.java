class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        // int l=0;
        // int r=nums.length-1;
        // while(l<r)
        // {
        //     int mid=l+r/2;
        //     if(target==nums[mid])
        //     {
        //         if(nums[mid-1]==target)
        //         {
        //             ans.add(mid-1);
        //         }
        //         ans.add(mid);
        //         if(nums[mid+1]==target)
        //         {
        //             ans.add(mid+1);
        //         }
        //     }
        //     else if(nums[mid]>target)
        //     {
        //         l=mid+1;
        //     }
        //     r=mid-1;
        // }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
