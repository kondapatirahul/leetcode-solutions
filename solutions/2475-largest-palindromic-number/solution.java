class Solution {
    public String largestPalindromic(String num) {
        int[] count = new int[10];
        for (char c : num.toCharArray()) {
            count[c - '0']++;
        }
        StringBuilder left = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (i == 0 && left.length() == 0) {
                break;
            }
            while (count[i] >= 2) {
                left.append(i);
                count[i] -= 2;
            }
        }
        String center = "";
        for (int i = 9; i >= 0; i--) {
            if (count[i] > 0) {
                center = String.valueOf(i);
                break;
            }
        }
        if (left.length() == 0 && center.isEmpty()) {
            return "0";
        }
        StringBuilder right = new StringBuilder(left).reverse();
        return left.toString() + center + right.toString();
    }
}
