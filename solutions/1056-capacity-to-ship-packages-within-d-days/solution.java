class Solution {
    public int getDays(int weights[],int m)
    {
        int days=1;
        int current=0;
        for(int w:weights)
        {
            if(current+w>m)
            {
                days++;
                current=w;
            }
            else{
                current+=w;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
       int low=Arrays.stream(weights).max().getAsInt();
       int high=Arrays.stream(weights).sum();
       int ans=low;
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(getDays(weights,mid)<=days)
        {
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
}
