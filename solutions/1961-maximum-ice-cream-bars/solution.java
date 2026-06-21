class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //int count=0;
        Arrays.sort(costs);
        long prefix[]=new long[costs.length];
        prefix[0]=costs[0];
        for(int j=1;j<costs.length;j++)
        {
            prefix[j]=prefix[j-1]+costs[j];
        }
        for(int i=prefix.length-1;i>=0;i--)
        {
            if(prefix[i]<=coins)
            {
                return i+1;
            }

        }
        return 0;
    }
}
