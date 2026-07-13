class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res=new ArrayList<>();
    //brute force  
    //   for(int i=low;i<=high;i++)
    //     {
    //         int ans=i;
    //         int num=ans%10;
    //         ans/=10;
    //         boolean isValid=true;
    //         while(ans>0)
    //         {
    //             int digit=ans%10;
    //             if(num-digit!=1)
    //             {
    //                 isValid=false;
    //                 break;
    //             }
    //             num=digit;
    //             ans/=10;
    //         }
    //         if(isValid)
    //         {
    //             res.add(i);
    //         }

    //     }
    //  return res; 
        String digits = "123456789";
        for (int length = 2; length <= 9; length++) {
            for (int i = 0; i <= 9 - length; i++) {
                String sub = digits.substring(i, i + length);
                int num = Integer.parseInt(sub);
                if (num >= low && num <= high) {
                    res.add(num);
                }
            }
        }    
        return res;
    }
}
