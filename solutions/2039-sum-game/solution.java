class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
       int firstsum=0;
       int secondsum=0;
        int firstC=0;
        int secondC=0;
       for(int i=0;i<n/2;i++)
       {
        if(num.charAt(i)=='?')
        {
            firstC ++;
        }
        else{
            firstsum+=num.charAt(i)-'0';
        }
       }
       for(int i=num.length()/2;i<num.length();i++)
       {
        if(num.charAt(i)=='?')
        {
            secondC ++;
        }
        else{
            secondsum+=num.charAt(i)-'0';
        }
       }
       if((firstC+secondC)%2!=0)
       {
        return true;
       }
       return 2*(firstsum-secondsum)!=9*(secondC-firstC);
    }
}
