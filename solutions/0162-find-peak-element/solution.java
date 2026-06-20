class Solution {
    public int findPeakElement(int[] nums) {
        int i=1;
        while(i<nums.length && nums[i-1]<nums[i])
        {
            i++;
        }
        return i-1;
    }
}
