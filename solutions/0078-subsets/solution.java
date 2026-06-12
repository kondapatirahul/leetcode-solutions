class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int ts=(1<<n);
        for(int i=0;i<ts;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i>>j)&1) == 1)
                {
                    temp.add(nums[j]);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
