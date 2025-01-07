class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for(String word : words){
            for(int i = 0;i<words.length;i++){
                if(!word.equals(words[i])){
                    if(words[i].contains(word)){
                        if(!res.contains(word)){
                            res.add(word);
                        }
                    }
                }
                else{
                    continue;
                }
            }
        }
        return res;
    }
}