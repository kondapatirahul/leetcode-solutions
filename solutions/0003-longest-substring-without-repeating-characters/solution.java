class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
       HashSet<Character> sb=new HashSet<>();
       int maxcount=0;
        int left=0;
        for(int i=0;i<n;i++)
        {
            while(sb.contains(s.charAt(i)))
            {
                sb.remove(s.charAt(left));
                left++;
            }
           
                sb.add(s.charAt(i));
                maxcount=Math.max(i-left+1,maxcount);

            
        }
        return maxcount;
        
    }
}
