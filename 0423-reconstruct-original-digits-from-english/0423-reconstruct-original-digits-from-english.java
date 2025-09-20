class Solution {
    public String originalDigits(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        int[] digits = new int[10];
        digits[0] = map.getOrDefault('z', 0);
        digits[2] = map.getOrDefault('w', 0);
        digits[4] = map.getOrDefault('u', 0);
        digits[6] = map.getOrDefault('x', 0);
        digits[8] = map.getOrDefault('g', 0);
        
        digits[3] = map.getOrDefault('h', 0) - digits[8];
        digits[5] = map.getOrDefault('f', 0) - digits[4];
        digits[7] = map.getOrDefault('s', 0) - digits[6];
        digits[1] = map.getOrDefault('o', 0) - digits[0] - digits[2] - digits[4];
        digits[9] = map.getOrDefault('i', 0) - digits[5] - digits[6] - digits[8];
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 9; i++)
            for(int j = 0; j < digits[i]; j++)
                sb.append(i);
        return sb.toString();
    }
}
