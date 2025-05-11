class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
       int count=0;
        for(int i=0;i<arr.length && count<3;i++){
            if(arr[i]%2!=0) count++;
            else count=0;
        }

        return (count!=3)?false:true;  
    }
}