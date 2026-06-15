class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> res=new ArrayList<>();
       backtrack(res,new StringBuilder(),0,0,n);
       return res;
    }
    public void backtrack(List<String> list,StringBuilder s,int open,int close,int max)
    {
        if(s.length()==max*2)
        {
            list.add(s.toString());
            return;        
        }
        if(open<max)
        {
            s.append("(");
            backtrack(list,s,open+1,close,max);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open)
        {

            s.append(")");
            backtrack(list,s,open,close+1,max);
            s.deleteCharAt(s.length()-1);
        }
        
    }
}
