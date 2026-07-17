// class Solution {
//     public int[] plusOne(int[] digits) {
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<digits.length;i++)
//        {
//         sb.append(digits[i]);
//        }
//        String s=sb.toString();
//        long num = Long.parseLong(s);
//        num += 1;
//     List<Integer> res=new ArrayList<>();
//     // if (num == 0) {
//     //        res.add(0);
//     //    }
//     while(num>0)
//     {
//         int last=(int)(num%10);
//         res.add(last);
//         num=num/10;
//     }
//     int ans[]=new int[res.size()];
//     int j=0;
//     for(int i=res.size()-1;i>=0;i--)
//     {
//         ans[j]=res.get(i);
//         j++;
//     }

//        return ans;
//     }
// }
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int carry = 1; 
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            res.add(sum % 10); 
            carry = sum / 10;  
        }
        if (carry > 0) {
            res.add(carry);
        }
        int ans[] = new int[res.size()];
        int j = 0;
        for (int i = res.size() - 1; i >= 0; i--) {
            ans[j] = res.get(i);
            j++;
        }
        return ans;
    }
}

