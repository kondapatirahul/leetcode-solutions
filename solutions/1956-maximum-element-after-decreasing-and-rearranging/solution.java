
class Solution {
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        // brute force . cant pass all testcases
        // if(arr[0]!=1)
        // {
        //     for(int i=1;i<arr.length;i++)
        //     {
        //         if(arr[i]==1)
        //         {
        //             int temp=arr[i];
        //             arr[i]=arr[0];
        //             arr[0]=temp;
        //             break;

        //         }
        //     }
        // }
        // for(int i=1;i<arr.length;i++)
        // {
        //     int val=Math.abs(arr[i]-arr[i-1]);
        //     if(val>1)
        //     {
        //         arr[i]=arr[i-1]+1;
        //     }
        // }
        // int max=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     max=arr[i]>max? arr[i]:max;
        // }
        // return max;
        int currentmax=0;
        for(int num:arr)
        {
            if(num>currentmax)
            {
                currentmax++;
            }
        }
       // System.gc();
        return currentmax;
    }
}
