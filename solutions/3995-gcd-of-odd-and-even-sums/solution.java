class Solution {
    public int gcdOfOddEvenSums(int n) {
        //optimal math 
        return n;
        // logic code 
        // int sumodd=0;
        // int sumeven=0;
        // for(int i=0;i<=n*2;i++)
        // {
        //     if((i&1)==0)
        //     sumeven+=i;
        //     else
        //     sumodd+=i;
        // }
        // while (sumodd != 0) {
        //     int temp = sumodd;
        //     sumodd = sumeven % sumodd;
        //     sumeven = temp;
        // }
        // return sumeven;
    }
}
