class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(freq.containsKey(target-nums[i])) return new int[]{freq.get(target-nums[i]),i};
            freq.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}