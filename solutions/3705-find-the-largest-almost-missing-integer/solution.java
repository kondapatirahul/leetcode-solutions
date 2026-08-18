class Solution {
    public int largestInteger(int[] nums, int k) {
        int freq[]=new int[51];
        int n=nums.length;
       int max=-1;
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
            max=max>nums[i]? max:nums[i];
        }
        if(k==1)
        {
            int maxonce=-1;
            for(int i=0;i<n;i++)
            {
                if(freq[nums[i]]==1)
                {
                    maxonce=Math.max(maxonce,nums[i]);
                }
            }
            return maxonce;
        } 
        if(k==n)
        {
            return max;
        }
        if(freq[nums[0]]==1 && freq[nums[n-1]]==1)
        {
            return Math.max(nums[0],nums[n-1]);
        }
        else{
            if(freq[nums[0]]>1 && freq[nums[n-1]]>1)
            {
                return -1;
            }
            if(freq[nums[0]]>1)
            {
                return nums[n-1];
            }
            if(freq[nums[n-1]]>1)
            {
                return nums[0];
            }
        }
        return -1;
    }
}
// class Solution {
//     public int largestInteger(int[] nums, int k) {
//         int n = nums.length;
//         int[] freq = new int[51];
//         for (int num : nums) {
//             freq[num]++;
//         }
//         if (k == 1) {
//             int maxOnce = -1;
//             for (int num : nums) {
//                 if (freq[num] == 1) {
//                     maxOnce = Math.max(maxOnce, num);
//                 }
//             }
//             return maxOnce;
//         }
//         if (k == n) {
//             int maxVal = -1;
//             for (int num : nums) {
//                 maxVal = Math.max(maxVal, num);
//             }
//             return maxVal;
//         }
//         boolean firstUnique = freq[nums[0]] == 1;
//         boolean lastUnique = freq[nums[n - 1]] == 1;
//         if (firstUnique && lastUnique) {
//             return Math.max(nums[0], nums[n - 1]);
//         } else if (firstUnique) {
//             return nums[0];
//         } else if (lastUnique) {
//             return nums[n - 1];
//         }

//         return -1;
//     }
// }
