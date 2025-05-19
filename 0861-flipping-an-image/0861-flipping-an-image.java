class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            flip(row,0,row.length-1);            
        }

        return image;
    }

    public static void flip(int[] arr,int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j]^1;
            arr[j]=temp^1;
            i++;
            j--;
        }
    }
}