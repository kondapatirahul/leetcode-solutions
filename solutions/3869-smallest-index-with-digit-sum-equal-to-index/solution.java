class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int value=nums[i];
            int sum=0;
            while(value!=0)
            {
                int last=value%10;
                sum+=last;
                value/=10;
            }
            if(sum==i)
            {
                min=Math.min(min,i);
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
    }
}
