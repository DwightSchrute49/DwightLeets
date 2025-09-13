class Solution {
    public int maxFreqSum(String s) {
        int freq [] = new int [26];
        for(char c : s.toCharArray()){
            freq[c-'a'] ++;
        }
        int vowel[] = new int[5];
        int conso[] = new int [21];

        int vi = 0, ci = 0;

        for(int i = 0; i <26; i++){
            char c = (char) (i + 'a');
            if(isVowel(c)){
                vowel[vi++] = freq[i];
            }
            else
            conso[ci++] = freq[i];
        }

        Arrays.sort(vowel);
        Arrays.sort(conso);

        int maxV = vowel[4];
        int maxC = conso[20];

        return maxV + maxC;
    }
    boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u';
    }
}