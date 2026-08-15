class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        Set<Character> seen=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(!seen.add(ch))
            {
                return ch;
            }
        }
        return ' ';
    }
}
