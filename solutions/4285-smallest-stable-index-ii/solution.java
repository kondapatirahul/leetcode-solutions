class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int prefmax[]=new int[n];
        prefmax[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefmax[i]=Math.max(nums[i],prefmax[i-1]);
        }
        int sufmin[]=new int[n];
        sufmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            sufmin[i]=Math.min(nums[i],sufmin[i+1]);
        }
        for(int i=0;i<prefmax.length;i++)
        {
            int sum=prefmax[i]-sufmin[i];
            if(sum<=k)
            {
                return i;
            }
        }
        return -1;
    }
}
