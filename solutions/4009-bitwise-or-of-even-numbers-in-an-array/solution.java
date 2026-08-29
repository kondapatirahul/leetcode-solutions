class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & 1)==0)
            {
                count|=nums[i];
            }
        }
        return count;
    }
}
