class Solution {
    public boolean isPerfectSquare(int num) {
     if(num==1 || num==0) return true;
     int left=1,right=num/2;

     while(left<=right){
        int mid=left+(right-left)/2;
        long product=(long)mid*mid;
        
        if(product==num) return true;
        else if(product>num){
            right=mid-1;
        }else{
            left=mid+1;
        }
     }

     return false;   
    }
}