class Solution {
    public int missingNumber(int[] nums) {
        int mis=0;
        for(int i=0;i<=nums.length;i++)
        {
            mis^=i;
        }       
        for(int i=0;i<nums.length;i++)
        {
            mis^=nums[i];
        }
        return mis;
   }
}
