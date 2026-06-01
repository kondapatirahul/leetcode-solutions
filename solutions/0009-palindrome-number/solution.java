class Solution {
    public boolean isPalindrome(int x) {
        String temp=Integer.toString(x);
        int digit[]=new int[temp.length()];
        boolean yn=true;
        for(int i=0;i<temp.length();i++)
        {
            digit[i]=temp.charAt(i);
        }
        int l=0;
        int r=digit.length-1;
        while(l<r)
        {
            if(digit[l]!=digit[r])
            {
                yn=false;
            }
            l++;
            r--;
        }
        return yn;
    }
}
