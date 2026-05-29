class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashSet<Character> longestSubstring = new HashSet<>();
        int maxLength = 0;
        
        for (int r = 0; r < s.length(); r++) {
            char currentChar = s.charAt(r);
            
            
            while (longestSubstring.contains(currentChar)) {
                longestSubstring.remove(s.charAt(l));
                l++;
            }
            
            
            longestSubstring.add(currentChar);
            
            
            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}
