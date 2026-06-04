class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                duplicate=nums[i];
                break;
            }
        }
        return duplicate;
      
}
}
