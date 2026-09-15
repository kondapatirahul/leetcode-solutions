class Solution {
    public int takeCharacters(String s, int k) {
        int total[]=new int[3];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            total[ch-'a']++;
        }
        if(total[0]<k || total[1]<k || total[2]<k)
        {
            return -1;
        }
        int l=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            total[s.charAt(i)-'a']--;
            while(total[0]<k || total[1]<k|| total[2]<k)
            {
                total[s.charAt(l)-'a']++;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return n-max;
    }
}
