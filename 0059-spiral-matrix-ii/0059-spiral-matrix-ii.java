class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];

        int rows=n;
        int cols=n;
        int row=0;
        int col=0;
        int num=1;

        while(row<rows && col<cols){
            for(int i=col;i<cols;i++){
                result[row][i]=num++;
            }

            row++;

            for(int i=row;i<rows;i++){
                result[i][cols-1]=num++;
            }

            cols--;

            if(row<rows){
                for(int i=cols-1;i>=col;i--){
                    result[rows-1][i]=num++;
                }
                rows--;
            }

            if(col<cols){
                for(int i=rows-1;i>=row;i--){
                    result[i][col]=num++;
                }
                col++;
            }
        }

        return result;
    }
}