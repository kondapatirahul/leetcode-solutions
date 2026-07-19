import java.util.Stack;
class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> sb = new Stack<>();
        if (s.isEmpty()) return "";
        sb.push(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            char current=s.charAt(i);
            if (sb.contains(current)) {
                continue; 
            }
            while (!sb.isEmpty() && sb.peek() > current && s.indexOf(sb.peek(), i) != -1) {
                sb.pop();
            }
            sb.push(current);
        }
        StringBuilder ans=new StringBuilder();
        for (char ch : sb) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
