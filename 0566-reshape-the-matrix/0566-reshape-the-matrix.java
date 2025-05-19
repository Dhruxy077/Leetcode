class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n != r*c) return mat;
        // int[] temp=new int[r*c];
        // int k=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         temp[k++]=mat[i][j];
        //     }
        // }

        int[][] result=new int[r][c];
        // k=0;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         result[i][j]=temp[k++];
        //     }
        // }

        for(int i=0;i<m*n;i++){
        result[i/c][i%c]=mat[i/n][i%n];
        }

        return result;
    }
}