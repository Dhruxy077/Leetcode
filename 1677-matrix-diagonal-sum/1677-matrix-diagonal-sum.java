class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int m=mat[0].length;

        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=m-i-1)sum+=mat[i][m-i-1];
        }

        return sum;
    }
}