class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);   
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            int last = x % 10;
            sb.append(last);
            x = x / 10;
        }
        String s = sb.toString();
        if (s.isEmpty()) {
            return 0;
        }
        long longNum = Long.parseLong(s) * sign;
        if (longNum < Integer.MIN_VALUE || longNum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) longNum;
    }
}

