class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(!mapST.containsKey(sc) && !mapTS.containsKey(tc)){
                mapST.put(sc, tc);
                mapTS.put(tc, sc);
            }
            else{
                if(mapST.getOrDefault(sc, '#') != tc || mapTS.getOrDefault(tc, '#') != sc){
                    return false;
                }
            }
        }
        return true;
    }
}