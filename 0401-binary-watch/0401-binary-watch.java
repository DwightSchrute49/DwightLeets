class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>  ans = new ArrayList<>();
        for (int h =0; h<12;h++){
            for(int m = 0; m<60;m++){
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn)
                ans.add(String.format("%d:%02d", h,m));
            }
        } 
        return ans;
    }
}

// 4 leds on thee top to represent the hours

//6 on the bottom to represent the minutes

//