class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        // int maxi[]=new int[n];
        // int max=nums[0];
        // for(int i=0;i<n;i++)
        // {
        //     if(max>=nums[i])
        //     {
        //         maxi[i]=max;
        //     }
        //     else{
        //         max=nums[i];
        //         maxi[i]=nums[i];
        //     }
        // }
        int max=nums[0];
        int prefix[]=new int[n];
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            prefix[i]=findGCD(nums[i],max);
        }
        Arrays.sort(prefix);
        long sum=0;
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
           
            sum+=findGCD(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;
    }
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
