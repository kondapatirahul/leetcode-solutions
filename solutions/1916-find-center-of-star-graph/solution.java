class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> hs=new HashSet<>();
        int totalElements = 0;
        for (int[] row : edges) {
            totalElements += row.length;
        }
        int[] array1D = new int[totalElements];
        int index = 0;
        int max=Integer.MIN_VALUE;
        for (int[] row : edges) {
            for (int element : row) {
                array1D[index++] = element;
                max=max<element? element:max;
            }
        }
        int fre[]=new int[max+1];
        for(int i=0;i<array1D.length;i++)
        {
            fre[array1D[i]]++;
        }
        int maxele=Integer.MIN_VALUE;
        for(int i=0;i<fre.length;i++)
        {
            maxele=fre[i]>maxele? i:maxele;
        }
        return maxele;
    }
}
