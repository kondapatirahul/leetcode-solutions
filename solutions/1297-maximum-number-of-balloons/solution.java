class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[26];
        for(int i=0;i<text.length();i++)
        {
            freq[text.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<freq.length;i++)
        {
            if(freq['b'-'a']<min)
            {
                min=freq['b'-'a'];
            }
            if(freq['a'-'a']<min)
            {
                min=freq['a'-'a'];
            }
            if(freq['l'-'a']/2<min)
            {
                min=freq['l'-'a']/2;
            }
            if(freq['o'-'a']/2<min)
            {
                min=freq['o'-'a']/2;
            }
            if(freq['n'-'a']<min)
            {
                min=freq['n'-'a'];
            }
        }
        return min;
        
    }
}
