class Solution {
    public int longestPalindrome(String[] words) {
       Map<String,Integer> map=new HashMap<>();

       for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
       }

       int length=0;
       boolean isCentered=false;

       for(Map.Entry<String,Integer> entry:map.entrySet()){
            String word=entry.getKey();
            int count=entry.getValue();
            if(count==0) continue;
            String reversed=new StringBuilder(word).reverse().toString();

            if(word.equals(reversed)){
                length+=(count/2)*4;
                if(count%2==1){
                    isCentered=true;
                }
            }else if(word.compareTo(reversed)<0 && map.containsKey(reversed)){
                int reversedCount=map.getOrDefault(reversed,0);

                int pairs=Math.min(reversedCount,count);
                length+=pairs*4;
            }
       }

       if(isCentered) length+=2;

       return length;
    }
}