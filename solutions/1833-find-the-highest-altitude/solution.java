class Solution {
    public int largestAltitude(int[] gain) {
        int point=0;
        int altitude=0;
        for(int i=0;i<gain.length;i++)
        {
            point+=gain[i];
            altitude=Math.max(point,altitude);
        }
        return altitude;
    }
}
