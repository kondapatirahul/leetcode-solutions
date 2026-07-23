class Solution {
    public int uniqueXorTriplets(int[] nums) {
     if(nums.length==1) return 1;   
     if(nums.length==2) return 2;
     int high=Integer.highestOneBit(nums.length);
     return high<<1;   
    }
}
