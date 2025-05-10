class Solution {
    public void sortColors(int[] arr) {
         // code here
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) zero++;
            else if(arr[i]==1) one++;
            else if(arr[i]==2) two++;
        }
        int index=0;
        while(index<zero){
            arr[index++]=0;
        }
        while(index<arr.length-two){
            arr[index++]=1;
        }
        while(index<arr.length){
            arr[index++]=2;
        }
    }
}