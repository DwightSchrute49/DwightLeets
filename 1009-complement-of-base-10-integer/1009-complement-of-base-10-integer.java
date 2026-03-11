class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder s = new StringBuilder();
        String b = Integer.toBinaryString(n);
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '0') s.append('1'); else s.append('0');
        }
        return Integer.parseInt(s.toString(),2);
    }
}