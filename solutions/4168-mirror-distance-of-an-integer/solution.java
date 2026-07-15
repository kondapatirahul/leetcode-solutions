class Solution {
    public int mirrorDistance(int n) {
        // String sb=String.valueOf(n);
        // StringBuilder sb1=new StringBuilder();
        // for(int i=sb.length()-1;i>=0;i--)
        // {
        //     sb1.append(sb.charAt(i));
        // }
        // int num = Integer.parseInt(sb1.toString());
        // return Math.abs(n-num);
        int original=n;
        int reverse=0;
        while(n>0)
        {
            int last=n%10;
            reverse=(reverse*10)+last;
            n/=10;
        }
        return Math.abs(original-reverse);
    }
}
