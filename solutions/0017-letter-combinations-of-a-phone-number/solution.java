class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)
        {
            return res;
        }
        StringBuilder sb=new StringBuilder();

        combination(0,digits,sb,res);
        return res;
    }
    public static void combination(int idx,String digits,StringBuilder sb,List<String> res){
        if(sb.length()==digits.length())
        {
            res.add(sb.toString());
            return;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letters=map[digits.charAt(idx)-'0'];
        for(char ch:letters.toCharArray())
        {
            sb.append(ch);
            combination(idx+1,digits,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
}
