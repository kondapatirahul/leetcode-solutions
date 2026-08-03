class Solution {
    int n;
    int dp[];
    public String stoneGameIII(int[] stoneValue) {
        n=stoneValue.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int diff=solve(stoneValue,0);
        if(diff>0)
        {
            return "Alice";
        }
        else if(diff<0){
            return "Bob";
        }
            return "Tie";
    }
    public int solve(int []s,int i)
    {
        if(i>=n)
            return 0;
        if (dp[i] != -1) return dp[i]; 
        int maxDiff = Integer.MIN_VALUE;
        int currentTake = 0;
        for (int k = 0; k < 3 && i + k < n; k++) {
            currentTake += s[i + k];
            int nextDiff = currentTake - solve(s, i + k + 1);
            maxDiff = Math.max(maxDiff, nextDiff);
        }
        
        return dp[i] = maxDiff;
    }
}
