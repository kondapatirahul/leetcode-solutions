class Solution {
    public int numberOfSpecialChars(String word) {
       // HashMap<String,Integer> map=new HashMap<>();
       boolean lower[]=new boolean[26];
       boolean upper[]=new boolean[26];
       for(int i=0;i<word.length();i++)
       {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z')
            {
                lower[ch-'a']=true;
            }
            else if(ch>='A' && ch<='Z')
            {
                upper[ch-'A']=true;
            }
       }
       int count=0;
       for(int i=0;i<26;i++)
       {
        if(lower[i]==true && upper[i]==true)
        {
            count++;
        }
       }
       return count;

    }
}
