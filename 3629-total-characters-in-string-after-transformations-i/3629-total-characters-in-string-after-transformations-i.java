class Solution {
    // Modulo value to handle large numbers
    private static final int MOD = 1000000007;

    public int lengthAfterTransformations(String s, int t) {
        // dp[i] represents how many characters a single character will become after transformations
        // First 26 positions represent characters after 0 transformations
        // Position i+26 represents characters after i transformations
        int[] transformationResults = new int[t + 26];
        
        // Initialize the base case: each character is 1 character initially
        for (int i = 0; i < 26; i++) {
            transformationResults[i] = 1;
        }
        
        // Calculate transformation results for each iteration
        // Each character transforms according to the rule: char -> char + (char + 1)
        for (int i = 26; i < t + 26; i++) {
            // Current character becomes itself + next character in previous iteration
            transformationResults[i] = (transformationResults[i - 26] + transformationResults[i - 25]) % MOD;
        }
        
        // Calculate final length by summing contribution of each character
        int finalLength = 0;
        
        // For each character in original string, add its contribution to final length
        for (char c : s.toCharArray()) {
            finalLength = (finalLength + transformationResults[c - 'a' + t]) % MOD;
        }
        
        return finalLength;
    }
}