class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        Arrays.sort(queries,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> available=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> usedQuery=new PriorityQueue<>();
        int n=nums.length;
        int m=queries.length;
        int queryPos=0;
        int appliedCount=0;
        for(int i=0;i<n;i++){

            while(queryPos<m && queries[queryPos][0]==i){
                available.offer(queries[queryPos][1]);
                queryPos++;
            }

            nums[i]-=usedQuery.size();

            while (nums[i] > 0 && !available.isEmpty() && available.peek() >= i) {
                usedQuery.offer(available.poll());
                nums[i]--;
                appliedCount++;
            }

            if(nums[i]>0) return -1;

            while(!usedQuery.isEmpty() && usedQuery.peek()==i){
                usedQuery.poll();
            }
        }
        return m-appliedCount;
    }
}