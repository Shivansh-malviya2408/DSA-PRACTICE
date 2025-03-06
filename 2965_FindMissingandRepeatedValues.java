class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int repeat=0,n=grid.length,n2=n*n,gridSum=0;
        int hash[]= new int[n2+1];
        
        for(int i =0; i<n; i++)
        {
            for(int j=0; j<grid[i].length; j++)
            {
                 gridSum+=grid[i][j];
                hash[grid[i][j]]++;
                if( hash[grid[i][j]]==2) repeat=grid[i][j];
                
            }
        }

        int expectedSum=n2*(n2+1)/2;
        int diffSum=gridSum-expectedSum;

        return new int[]{repeat,repeat-diffSum};



    }
}