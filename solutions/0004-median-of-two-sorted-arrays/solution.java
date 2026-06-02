class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        double median;
        int sum=0;
        int c[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            c[i]=nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            c[n+i]=nums2[i];
        }
        Arrays.sort(c);
        
        if((c.length)%2==1)
        {
            median=c[c.length/2];
        }
        else{
            median=(c[c.length/2]+c[(c.length/2)-1])/2.0;
        
        }
        
        return median;
    }
}
