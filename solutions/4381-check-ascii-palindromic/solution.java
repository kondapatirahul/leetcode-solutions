class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
            {
                int ch=(int) s.charAt(i);
                sb.append(binary(ch));
            }
        int left=0;
        int right=sb.length()-1;
        while(left<right)
            {
                if(sb.charAt(left)!=sb.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
        return true;
    }
    private String binary(int ch)
    {
        StringBuilder sb=new StringBuilder();
        while(ch!=0)
            {
                sb.append(ch%2);
                ch/=2;
            }
            while(sb.length()<8)
            {
                sb.append('0');
            }

        return sb.reverse().toString();
    }
}
