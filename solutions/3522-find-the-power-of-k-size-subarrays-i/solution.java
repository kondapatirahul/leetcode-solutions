class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int cons=0;
        for(int i=0;i<k-1;i++){
            if(nums[i]+1==nums[i+1])
            cons++;
        }
        res[0]=(cons==k-1)?nums[k-1]:-1;
        for(int i=k;i<n;i++){
            if(nums[i-k+1]==nums[i-k]+1)
            cons--;
            if(nums[i]==nums[i-1]+1)
            cons++;
            if(cons==k-1)
            res[i-k+1]=nums[i];
            else
            res[i-k+1]=-1;
        }
       // System.gc();
        return res;
    }
}
