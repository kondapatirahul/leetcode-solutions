class Solution {
    public boolean hasAllCodes(String s, int k) {
        boolean ans=false;
        int size=1<<k;
        if(s.length()-k+1<size)
        {
            return false;
        }
        Set<String> seen=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub=s.substring(i,i+k);
            seen.add(sub);
            if(seen.size()==size)
            {
                return true;
            }
        }
        return seen.size()==size;
    }
}
