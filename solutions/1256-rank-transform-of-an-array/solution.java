class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int res[]=new  int[arr.length];
       for(int i=0;i<arr.length;i++)
       {
        res[i]=arr[i];
       }
       Arrays.sort(res);
       int ans[]=new int[arr.length];
    //brute force cant excute all beacause it shows TLE
    //    for(int i=0;i<arr.length;i++)
    //    {
    //     int rank=1;
    //     for(int j=0;j<arr.length;j++)
    //     {
    //         if(arr[i]==res[j])
    //         {
    //             ans[i]=rank;
    //             break;
    //         }
    //         if(j==0 || res[j]!=res[j-1])
    //         {
    //             rank++;
    //         }
    //     }
    //    }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int num:res)
        {
            if(!hm.containsKey(num))
            {
                hm.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=hm.get(arr[i]);
        }
       return ans;
    }
}
