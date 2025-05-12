class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] result=new int[len1+len2];
        int i=0,j=0,index=0;
        while(i<len1 && j<len2){
            if(nums1[i]<nums2[j]){
                result[index++]=nums1[i++];
            }else{
                result[index++]=nums2[j++];
            }
        }
        while(i<len1){
            result[index++]=nums1[i++];
        }
        while(j<len2){
            result[index++]=nums2[j++];
        }

        if(result.length%2==0){
            return (double)(result[(result.length/2)-1]+result[result.length/2])/2;
        }else{
            return result[result.length/2];
        }
    }
}