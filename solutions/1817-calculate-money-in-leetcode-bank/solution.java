class Solution {
    public int totalMoney(int n) {
        int w=n/7;
        int d=n%7;
        int fullw=28*w+7*w*(w-1)/2;
        int extradays=d*(w+1)+d*(d-1)/2;
        return fullw+extradays;
    }
}
