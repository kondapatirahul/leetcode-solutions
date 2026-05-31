class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        int n=nums.length;
        int frq[]=new int[101];
        for(int i=0;i<n;i++)
        {
            frq[nums[i]]++;
        }
        int maxfrq=0;
        for(int freq:frq)
        {
            maxfrq=Math.max(freq,maxfrq);
        }
        int ans=0;
        for(int freq: frq)
        {
            if(freq==maxfrq){
                ans+=freq;
            }
        }
        return ans;

    }
}
