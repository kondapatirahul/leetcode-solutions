class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
       // Arrays.sort(nums);
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
           if(nums[i]==nums[i-1]+1) sum+=nums[i];
           else 
           {
            break;
           } 
        }
        Set<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        while(hs.contains(sum))
        {
            sum=sum+1;
        }
        
        return sum;
    }
}
