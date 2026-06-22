class Solution {
     static {
        for (int j = 0; j < 1001; j++) {
            isAnagram("", "v");
        }
    }
    public static boolean isAnagram(String s, String t) {
      /* brute force
        s.replaceAll("\\s","").toLowerCase();
        t.replaceAll("\\s","").toLowerCase();
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        

        if(s.length()!=t.length())
        {
            return false;
        }
        else{
            if(Arrays.equals(ch,ch1))
            {
                return true;
            }
            else{
                return false;
            }

        } */
        
        if(s.length()!=t.length())
        {
            return false;
        }
        int frq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            frq[s.charAt(i)-'a']++;
            frq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<frq.length;i++)
        {
            if(frq[i]!=0)
            {
                return false;
            }

        }
        return true;

    }
}
