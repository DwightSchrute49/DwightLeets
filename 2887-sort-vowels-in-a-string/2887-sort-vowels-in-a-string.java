class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                result.append(vowels.get(idx++)); 
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
