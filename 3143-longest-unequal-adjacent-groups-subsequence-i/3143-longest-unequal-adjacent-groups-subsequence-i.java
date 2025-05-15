class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res=new ArrayList<>();
        res.add(words[0]);
        int len=groups.length;
        for(int i=1;i<len;i++){
            if(groups[i]!=groups[i-1]) res.add(words[i]);
        }

        return res;

    }
}