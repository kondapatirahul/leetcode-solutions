class Solution {
    public boolean isSumEqual(String fW, String sW, String tW) {
        int sum=0;
        int value=0;
        int svalue=0;
        for(int i=0;i<fW.length();i++)
        {
            value=value*10+fW.charAt(i)-'a';
        }
        for(int i=0;i<sW.length();i++)
        {
            svalue=svalue*10+sW.charAt(i)-'a';
        }
        int targetsum=0;
        for(int i=0;i<tW.length();i++)
        {
            targetsum=targetsum*10+tW.charAt(i)-'a';
        }
        sum=value+svalue;
        return sum==targetsum;


    }
}
