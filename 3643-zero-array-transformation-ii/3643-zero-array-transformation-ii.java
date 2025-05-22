class Solution {

    private boolean isZeroArray(int[] nums,int[][] queries,int mid){
        int n=nums.length;
        int[] temp=nums.clone();
        int[] diff=new int[n+1];

        for(int i=0;i<mid;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            int val=queries[i][2];

            diff[start]-=val;
            if(end+1<n) diff[end+1]+=val;
        }

        int currDecrement=0;
        for(int i=0;i<n;i++){
            currDecrement+=diff[i];
            temp[i]+=currDecrement;
            if(temp[i]>0) return false;
        }

        return true;
    }
    public int minZeroArray(int[] nums, int[][] queries) {
        int left=0;
        int right=queries.length;
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(isZeroArray(nums,queries,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return ans;
    }
}