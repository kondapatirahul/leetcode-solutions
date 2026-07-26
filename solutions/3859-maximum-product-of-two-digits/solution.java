class Solution {
    public int maxProduct(int n) {
        int maxA = 0;
        int maxB = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= maxA) {
                maxB = maxA;
                maxA = digit;
            } else if (digit > maxB) {
                maxB = digit;
            }
            n /= 10;
        }

        return maxA * maxB;
    }
}
