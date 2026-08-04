class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        HashSet<Integer> temp=new HashSet<>();
        for(int num:nums)
        {
            max=num>max? num:max;
            min=num<min? num:min;
            temp.add(num);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=min;i<max;i++)
        {
            if(!temp.contains(i))
            {
                res.add(i);
            }
        }
        return res;
    }
}
