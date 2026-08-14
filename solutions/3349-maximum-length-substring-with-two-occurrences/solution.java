class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int arr[]=new int[26];
        int l=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']++;
            while(arr[ch-'a']>2)
            {
                char leftchar=s.charAt(l);
                arr[leftchar-'a']--;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}
