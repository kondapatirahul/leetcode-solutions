class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totaltime=requests[0];
       for(int i=1;i<requests.length;i++)
           {
               totaltime+=Math.abs(requests[i]-requests[i-1]);
           }
        return totaltime;
    }
}
