class Solution {
    public int minimumPushes(String word) {
       int count=word.length();
       if(word.length()>8 && word.length()<=16)
       {
        count=(word.length()-8)*2 + 8;
       }
        if(word.length()>16 && word.length()<=24)
        {
            count=(word.length()-16)*3 +8+16 ;
        }
        if(word.length()>24 && word.length()<=26)
        {
            count=(word.length()-24)*4 +8+16+24 ;
        }
       return count;
    }
}
