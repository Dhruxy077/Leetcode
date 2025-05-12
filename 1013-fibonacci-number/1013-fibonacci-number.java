class Solution {
    public int fib(int n) {
        // if(n<=1) return n;
        // return fib(n-1)+fib(n-2);
        if(n==0) return 0;
        int a=0,b=1;
        for(int i=1;i<n;i++){
            int temp=a;
            a=b;
            b+=temp;
        }

        return b;
    }
}