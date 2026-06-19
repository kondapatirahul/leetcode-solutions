class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {

                sb.append(nums[i]);
        }
        int arr[]=new int[sb.length()];
        for(int i=0;i<sb.length();i++)
        {
            int ch=sb.charAt(i)-'0';
            arr[i]=ch;
        }
        return arr;
    }
}
