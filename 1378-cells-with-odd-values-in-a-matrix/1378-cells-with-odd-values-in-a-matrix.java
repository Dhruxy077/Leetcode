class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        // int[][] mat=new int[m][n];
        // for(int[] index:indices){
        //     incrementRow(mat,m,n,index[0]);
        //     incrementCol(mat,m,n,index[1]);
        // }

        // int count=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(mat[i][j]%2 !=0) count++;
        //     }
        // }
        // return count;

        int[] row=new int[m];
        int[] col=new int[n];
        int count=0;
        for(int[] i:indices){
            row[i[0]]++;
            col[i[1]]++;
        }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if((row[i]+col[j])%2 !=0) count++;
        //     }
        // }

        // return count;
         int oddRowCount = 0;
        for (int ro : row) {
            if (ro % 2 != 0) oddRowCount++;
        }

        int oddColCount = 0;
        for (int co : col) {
            if (co % 2 != 0) oddColCount++;
        }

        // Step 3: Calculate total number of odd cells
        // Formula: (odd rows * even columns) + (even rows * odd columns)
        int totalOdd = (oddRowCount * (n - oddColCount)) + ((m - oddRowCount) * oddColCount);

        return totalOdd;
        
    }

    static void incrementRow(int[][] mat,int m,int n,int row){
        for(int i=0;i<n;i++){
            mat[row][i]++;
        }
    }

    static void incrementCol(int[][] mat,int m,int n,int col){
        for(int i=0;i<m;i++){
            mat[i][col]++;
        }
    }
}