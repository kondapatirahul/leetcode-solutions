import java.util.*;

class ATM {
    int money[]={20,50,100,200,500};
    int stores[];
    public ATM() {
        stores=new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++)
        {
            stores[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int ans[]=new int[5];
        int index=4;
        while(amount>0 && index>=0)
        {
            int takethismany=Math.min(amount/money[index],stores[index]);
            ans[index]=takethismany;
            amount-=takethismany*money[index];
            index--;
        }
        if(amount!=0)
        {
            return new int[]{-1};
        }
        else{
            for(int i=0;i<5;i++)
            {
                stores[i]-=ans[i];
            }
            return ans;
        }

    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
