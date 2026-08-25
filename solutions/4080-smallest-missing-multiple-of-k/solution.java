class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int ans=101;
        for(int i=1;i<100;i++)
        {
            int mis=k*i;
            if(!set.contains(mis))
            {
                ans=mis;
                break;
            }
        }
        return ans;
    }
}
