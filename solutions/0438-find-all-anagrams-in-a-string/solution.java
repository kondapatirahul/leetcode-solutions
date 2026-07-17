class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
            
            String s1=s.substring(i,i + p.length());
            if(Anagram(s1,p))
            {
                ans.add(i);
            }  
        }
        return ans;
    }
    private boolean Anagram(String s,String p)
    {
        int freq1[]=new int[26];
       // int freq2[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            int ch=s.charAt(i)-'a';
            freq1[ch]++;

        }
        for(int i=0;i<p.length();i++)
        {
            int ch=p.charAt(i)-'a';
            freq1[ch]--;

        }
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=0)
            {
                return false;
            }
        }
    return true;
    }
}
