class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
       // int first=-1;
       arr[0]=-1;
        int last=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && arr[0]==-1)
            {
                arr[0]=i;
                last=i;
            }
            else if(nums[i]==target)
            {
                last=i;
            }
        }
       // arr[0]=first;
        arr[1]=last;
        return arr;
    }
}
