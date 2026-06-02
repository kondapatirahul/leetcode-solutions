class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candiate=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                candiate=nums[i];
                count=1;
            }
           else if(nums[i]==candiate)
            {
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==candiate)
            {
                count++;
            }
            

        }
        if(count>(nums.length/2))
        {
            return candiate;
        }
        else{
            return -1;
        }
        
    }
}
