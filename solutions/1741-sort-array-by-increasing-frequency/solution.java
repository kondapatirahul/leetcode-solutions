class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int  num=nums[i];
          //  if(hs.containsKey(num))
            //{
                hs.put(num,hs.getOrDefault(num,0)+1);
            //}
           // hs.put(num,i);
        }
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            int freqa=hs.get(a);
            int freqb=hs.get(b);
            if(freqa != freqb)
            {
                return Integer.compare(freqa,freqb);
            }
            return Integer.compare(b,a);
        });
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
        return nums;

    }
}
