class Solution {
    static {
        for(int i=0;i<100;i++)
        {
            findMaxAverage(new int[1],1);
        }
    }
    public static double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        avg=sum/k;
        double max=avg;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            avg=sum/k;
            max=avg>max? avg:max;
        }
        return max;
    }
}
