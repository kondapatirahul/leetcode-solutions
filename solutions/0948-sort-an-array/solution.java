class Solution {
    public int[] sortArray(int[]  arr) {
        if(arr==null || arr.length<=1)
        {
            return arr;
        }
        mergeSort(arr,0,arr.length-1);
        return arr;

    }
    void mergeSort(int arr[],int l,int r)
    {
        if(l>=r)
        {
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    void merge(int arr[],int l,int m,int h)
    {
        int i=l;
        int j=m+1;
        int k=0;
        int newarr[]=new int[h-l+1];
        while(i<=m && j<=h)
        {
            if(arr[i]<=arr[j])
            {
                newarr[k]=arr[i];
                
                i++;
            }
            else{
                newarr[k]=arr[j];
                j++;
                
            }
            k++;
        }
        while(i<=m)
        {
            newarr[k]=arr[i];
            i++;
            k++;
        }
        while(j<=h)
        {
            newarr[k]=arr[j];
            j++;
            k++;
        }
        for(int c=0;c<h-l+1;c++)
        {
            arr[c+l]=newarr[c];
        }
        
    }
}
