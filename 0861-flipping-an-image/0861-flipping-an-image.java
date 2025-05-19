class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            flip(row,0,row.length-1);
            // System.out.println(Arrays.toString(row));
            
        }

        // for(int[] row:image){
        //     System.out.println(Arrays.toString(row));
        // }
        return image;

    }

    public static void flip(int[] arr,int i,int j){
        while(i<=j){
            arr[i]=arr[j]+arr[i]-(arr[j]=arr[i]);
            if(i!=j){
                arr[i]=1-arr[i];
                arr[j]=1-arr[j];
            }else{
                arr[i]=1-arr[i];
            }
            i++;
            j--;
        }
    }
}