class Solution {
    public int characterReplacement(String s, int k) {
        // Array to store the frequency of each character in the current window
        int[] counts = new int[26];
        
        int l = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        
        // Expand the window using the right pointer
        for (int r = 0; r < s.length(); r++) {
            // Update the count for the current character
            // s.charAt(r) - 'A' converts the character to an index between 0 and 25
            counts[s.charAt(r) - 'A']++;
            
            // Update the frequency of the most popular character seen so far in the window
            maxFrequency = Math.max(maxFrequency, counts[s.charAt(r) - 'A']);
            
            
            int windowLength = r - l + 1;
            
            
        
            if (windowLength - maxFrequency > k) {
            
                
                counts[s.charAt(l) - 'A']--;
                
                l++;
            }
            
            
            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}