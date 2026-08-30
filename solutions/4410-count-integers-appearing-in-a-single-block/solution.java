class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> diff=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                diff.add(nums[i]);
                if(i==0 || nums[i-1]!=nums[i])
                {
                    map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                }
            }
        int count=0;
        for(int x:diff)
            {
                if(map.get(x)==1)
                {
                    count++;
                }
            }
        return count;
    }
}
