class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      /*brute force
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=target[i])
            {
                return false;
            }
        }*/
        int freq[]=new int[1001];
        for(int i=0;i<arr.length;i++)
        {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
