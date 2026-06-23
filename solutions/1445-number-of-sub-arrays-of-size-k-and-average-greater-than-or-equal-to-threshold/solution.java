class Solution {
    public  int numOfSubarrays(int arr[], int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int target=k*threshold;
        int count=0;
        if(sum>=target)
        {
            count++;
        }
        int max=count;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>=target)
            {
                count++;
            }
            max=count>max ? count:max;
        }
        System.gc();
        return max;
    }
}
