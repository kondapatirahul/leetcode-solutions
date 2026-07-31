class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            int ch=word.charAt(i)-'a' ;
            if (ch >= 0 && ch < 26) 
            {
                freq[ch]++;
            } 
        }
        int n=0;
        int count=0;
        Arrays.sort(freq);
        for(int i=25;i>=0;i--)
        {
            if(freq[i]==0) break;
            if(n<8 )
            {
                count+=freq[i]*1;
            }
            else if(n<16)
            {
                count+=freq[i]*2;
                
            }
            else if(n<24)
            {
                count+=freq[i]*3;

            }
            else
            {
                count+=freq[i]*4;
            }
            n++;
        }
        return count;
    }
}
