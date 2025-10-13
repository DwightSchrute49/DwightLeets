class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        int len  = words.length;
        String last = "";
        for (String word : words){
            char ch [] = word.toCharArray();
            Arrays.sort(ch);
            String sorted = new String (ch);

            if(!sorted.equals(last)){
                ans.add(word);
                last = sorted;
            }
        }
        return ans;
    }
}