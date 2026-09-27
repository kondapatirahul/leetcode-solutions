class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==')')
            {
                int j=sb.lastIndexOf("(");
                String rev=new StringBuilder(sb.substring(j+1)).reverse().toString();
                sb.replace(j,sb.length(),rev);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
