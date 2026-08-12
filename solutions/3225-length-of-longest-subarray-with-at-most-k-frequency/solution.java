class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();
        int left=0;
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            while(freq.get(nums[i])>k)
            {
                freq.put(nums[left],freq.get(nums[left])-1);
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}
