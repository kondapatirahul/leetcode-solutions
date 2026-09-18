class Solution {
    public int sumBase(int n, int k) {
        // normal method
        // String result=Integer.toString(n,k);
        // int value=Integer.parseInt(result);
        // int sum=0;
        // while(value!=0)
        // {
        //     int last=value%10;
        //     sum+=last;
        //     value/=10;
        // }
        // return sum;


        // easy method----->
        int sum=0;
        while(n!=0)
        {
            int last=n%k;
            sum+=last;
            n/=k;
        }
        return sum;
    }
}
