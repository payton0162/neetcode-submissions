class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> MapS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> MapT = new HashMap<Character,Integer>();

        if (s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            MapS.put(c, MapS.getOrDefault(c, 0) + 1);
        }

        for(int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            MapT.put(c, MapT.getOrDefault(c, 0) + 1);
        }

        
        if (MapS.equals(MapT)) {
            return true;
        }

        return false;
    }
}







