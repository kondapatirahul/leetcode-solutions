class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal=Integer.MAX_VALUE;
        boolean hasOdd=false;
        for (int num:nums1) {
            if (num%2!=0) {
                hasOdd=true;
            }
            if (num<minVal) {
                minVal=num;
            }
        }
        if (!hasOdd) {
            return true;
        }
        return minVal%2!=0;
    }
}
