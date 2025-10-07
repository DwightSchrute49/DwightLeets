class Solution {
    public int[] avoidFlood(int[] rains) {
        Map<Integer,Integer> full = new HashMap<>();
        TreeSet<Integer> dry = new TreeSet<>();
        int len  = rains.length;
        int ans[] = new int [len];
        
        for(int i = 0; i < len; i++){
            if(rains[i] > 0){
                int lake = rains[i];
                if(full.containsKey(lake)){
                    Integer dryD = dry.higher(full.get(lake));
                    if(dryD == null) return new int[0];
                    ans[dryD] = lake;
                    dry.remove(dryD);
                }
                full.put(lake, i);
                ans[i] = -1;
            }
            else {
                dry.add(i);
                ans[i] = 1;
            }
        }
        return ans;
    }
}




