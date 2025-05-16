class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int i=1;
        while(i<n && nums[i-1]<=nums[i]){
            i++;
        }

        if(i==n) return true;
        i=i%n;

        swap(nums,0,i-1);
        swap(nums,i,n-1);
        swap(nums,0,n-1);

        for(int j=0;j<n-1;j++){
            if(nums[j]>nums[j+1]) return false;
        }
        return true;        
    }

    static void swap(int[] nums, int left,int right){
        while(left<right){
            nums[left]=nums[right]+nums[left]-(nums[right--]=nums[left++]);
        }
    }
}