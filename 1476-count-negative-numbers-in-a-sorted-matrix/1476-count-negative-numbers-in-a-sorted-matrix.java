class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // if(n==1 && m==1 && grid[0][0]==-1) return 1; 
        int count=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            if(grid[i][j]<0){
                count+=(n-i)*(m-j);
                m=j;
                break;
            } 
           }
        }
        return count;
    }
}