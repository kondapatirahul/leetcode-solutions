class Solution {
    public int[] applyOperations(int[] nums) {
       //int arr[]=new int[nums.length];
       for(int i=1;i<nums.length;i++)
       {
        if(nums[i]==nums[i-1])
        {
            nums[i-1]=nums[i-1]*2;
            nums[i]=0;
        }
       }
    int l=0;
     for(int r=0;r<nums.length;r++)
     {
        if(nums[r]!=0)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
        }
     }
     return nums;
    }
}
