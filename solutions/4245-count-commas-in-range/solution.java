class Solution {
    public int countCommas(int n) {
        if(n<1000)
        {
            return 0;
        }
        int count = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        int commas=(count-1)/3;
        if(n%1000<1000)
        {
            return commas+(n-1000);
        }
        return commas+(n%1000);
        
    }
}
