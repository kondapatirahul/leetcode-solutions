class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++)
        {
            String s=String.valueOf(i);
            String reversedText = new StringBuilder(s).reverse().toString();
            int rev=Integer.parseInt(reversedText);
            if(i+rev==num)
            {
                return true;
            }
        }
        return false;
    }
}
