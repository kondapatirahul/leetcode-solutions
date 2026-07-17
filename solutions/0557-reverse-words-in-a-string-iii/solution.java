class Solution {
    public String reverseWords(String s) {
        String[] result = s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<result.length;j++)
        {
            String word=result[j];
            for(int i=word.length()-1;i>=0;i--)
            {
                sb.append(word.charAt(i));
            }
            if (j < result.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
