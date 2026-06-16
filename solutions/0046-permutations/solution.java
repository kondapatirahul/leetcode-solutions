class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        subset(res,used,nums,ans);
        return ans;
    }
    public static void subset(List<Integer> res,boolean used[],int nums[],List<List<Integer>> ans)
    {
        if(res.size()==nums.length)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
            {
                continue;
            }
        used[i]=true;
        res.add(nums[i]);
        subset(res,used,nums,ans);
        res.remove(res.size()-1);
        used[i]=false;
        }
    }
    
}
