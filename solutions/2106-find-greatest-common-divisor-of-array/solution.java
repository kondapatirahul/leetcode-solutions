class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=nums[i]>min? min:nums[i];
            max=nums[i]>max? nums[i]: max;
        }
        return GCD(min,max);
    }
    private int GCD(int a, int b)
    {
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
