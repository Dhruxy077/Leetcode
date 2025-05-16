class Solution {
    static boolean hammeringDistance(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        int distance=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) distance++;
        }

        return distance==1;
    }
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        List<String> result=new ArrayList<>();
        int n=groups.length;

        int[] dp=new int[n];
        int[] parent=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(parent,-1);
        int maxIndex=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(groups[i]!=groups[j] &&
                        hammeringDistance(words[i],words[j]) &&
                        dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    parent[i]=j;
                }
            }
            if(dp[i]> maxIndex) maxIndex=dp[i];
        }

        for(int i=0;i<n;i++){
            if(dp[i]==maxIndex){
                while (i!=-1){
                    result.add(words[i]);
                    i=parent[i];
                }
                break;
            }
        }
        Collections.reverse(result);
        return result;
    }
}