class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[][] flag=new boolean[m][n];
        // int[][] ans=matrix;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0 && !flag[i][j]){

                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                        matrix[i][col]=0;
                        flag[i][col]=true;
                    
                        }
                    } 
                    for(int row=0;row<m;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j]=0;
                            flag[row][j]=true;
                        }
                    }
                }
            }
        }

        // matrix=ans;
    }
}