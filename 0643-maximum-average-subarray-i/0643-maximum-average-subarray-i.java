class Solution {
    public double findMaxAverage(int[] arr, int k) {
        // if(arr.length ==1 && k==1) return (double)arr[0];
        int maxSum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxSum=Math.max(maxSum,sum);

        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);
        }

        return (double) maxSum/k;
    }
}