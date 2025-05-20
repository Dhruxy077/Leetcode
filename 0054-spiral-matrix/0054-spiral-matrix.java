class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row=0;
        int col=0;

        while(row<rows && col<cols){

            for(int i=col;i<cols;i++){
                result.add(matrix[row][i]);
            }
            row++;

            for(int i=row;i<rows;i++){
                result.add(matrix[i][cols-1]);
            }
            cols--;

            if(row<rows){
                for(int i=cols-1;i>=col;i--){
                    result.add(matrix[rows-1][i]);
                }
                rows--;
            }

            if(col<cols){
                for(int i=rows-1;i>=row;i--){
                    result.add(matrix[i][col]);
                }
                col++;
            }
        }
        
        
        return result;

    }
}