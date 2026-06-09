class NumArray {
    int pref[];
    public NumArray(int[] nums) {
        this.pref=nums;
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            this.pref[i]=this.pref[i-1]+nums[i];
        }        
    }
    public int sumRange(int left, int right) {
        return left>0? pref[right]-pref[left-1]: pref[right];
    
}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
