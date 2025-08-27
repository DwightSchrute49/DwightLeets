class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
           ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < words.length; i++) {         
            String w = words[i];            
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < w.length(); j++) {        
                char c = w.charAt(j);
                sb.append(morse[c - 'a']);              
            }
            seen.add(sb.toString());                     
        }
        return seen.size();
    }
}
