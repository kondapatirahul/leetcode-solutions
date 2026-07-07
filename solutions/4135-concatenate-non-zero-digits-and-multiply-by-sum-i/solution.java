class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long mul=1;
        long x=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit!=0)
            {
                x=digit*mul+x;
                mul*=10;
                sum+=digit;
            }
            n/=10;
        }
        return sum*x;
        
    }
}
