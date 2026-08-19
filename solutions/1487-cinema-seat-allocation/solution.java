class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count=0;
        Map<Integer,boolean[]> reserved=new HashMap<>();
        for(int seats[]:reservedSeats)
        {
            int row=seats[0];
            int col=seats[1];
            if(col<2 || col>9) continue;
            boolean blocked[]=reserved.computeIfAbsent(row, k -> new boolean[3]);
            if(col==2 || col==3)
            {
                blocked[0]=true;
            }
            else if(col==4 || col==5)
            {
                blocked[0]=true;
                blocked[1]=true;
            }
            else if(col==6 || col==7)
            {
                blocked[1]=true;
                blocked[2]=true;
            }
            else if(col==8 || col==9)
            {
                blocked[2]=true;
            }
        }
        for(boolean[] blocked: reserved.values())
        {
            boolean left=!blocked[0];
            boolean mid=!blocked[1];
            boolean right=!blocked[2];
            if(left && right)
            {
                count+=2;
            }
            else if(left || right || mid)
            {
                count+=1;
            }
        }
        count+=(n-reserved.size())*2;
        return count;
    }
}
