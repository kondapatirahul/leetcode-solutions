class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String sub=s.substring(0,k);
        for(int i=sub.length()-1;i>=0;i--)
        {
            sb.append(sub.charAt(i));
        }
        sb.append(s.substring(k));
        return sb.toString();
    }
}
