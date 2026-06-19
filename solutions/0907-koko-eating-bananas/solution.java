class Solution {
    public int check(int arr[],int mid)
    {
        int t=0;
        for(int i=0;i<arr.length;i++)
        {
            t+=Math.ceil((double)arr[i]/mid);
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
      int low=0;
      int high=0;
      for(int i=0;i<piles.length;i++)
      {
        high=Math.max(high,piles[i]);
      }
      int ans=0;
      while(low<=high)
      {
        int mid=low+(high-low)/2;
        if(check(piles,mid)<=h)
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
