class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int[] res=new int[len];
        int i=0,j=0,idx=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[idx++]=nums1[i++];
            }else if(nums1[i]>nums2[j]){
                res[idx++]=nums2[j++];
            }
        }

        while(i<m)res[idx++]=nums1[i++];
        while(j<n)res[idx++]=nums2[j++];
        // Arrays.stream(res).forEach(e->System.out.print(e+" "));
        if((len)%2==0) return (double)(res[(len/2)-1]+res[len/2])/2;

        return (double)res[len/2];

    }
}