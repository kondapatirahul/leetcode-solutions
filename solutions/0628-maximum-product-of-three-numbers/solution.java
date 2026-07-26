class Solution {
    public int maximumProduct(int[] nums) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n >= maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = n;
            } else if (n >= maxB) {
                maxC = maxB;
                maxB = n;
            } else if (n >= maxC) {
                maxC = n;
            }

            if (n <= minA) {
                minB = minA;
                minA = n;
            } else if (n <= minB) {
                minB = n;
            }
        }

        return Math.max(maxA * maxB * maxC, minA * minB * maxA);
    }
}
