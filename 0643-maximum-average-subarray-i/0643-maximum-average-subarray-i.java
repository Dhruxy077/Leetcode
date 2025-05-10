class Solution {
    public double findMaxAverage(int[] arr, int k) {
         if(arr.length == 1) return (double)arr[0];
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            // System.out.println("arr["+i+"] : "+arr[i]);
            // System.out.println("sum: "+sum);
        }
        double maxSum= sum;

        for(int i=k; i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxSum= Math.max(maxSum,sum);
            // System.out.println("index: "+i+"\tarr[i]: "+arr[i]+"\tarr[i-k]: "+arr[i-k]+"\tMaxSum:"+maxSum);
            // System.out.println("sum: "+sum);
        }
        return maxSum/k;
    }
}