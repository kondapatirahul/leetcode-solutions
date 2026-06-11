class Solution {
    public boolean isAnagram(String s, String t) {
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

        }
    }
}
