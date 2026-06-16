class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();

        combinations(1,n,k,res,ans);
        return ans;
    }
    public static void combinations(int idx,int n,int k,List<Integer> temp,List<List<Integer>> ans)
    {
        if(temp.size()==k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<=n;i++)
        {

            temp.add(i);
            combinations(i+1,n,k,temp,ans);
            temp.remove(temp.size()-1);
        }

    }
}
