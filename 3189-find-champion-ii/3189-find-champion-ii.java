class Solution {
    public int findChampion(int n, int[][] edges) {
        List<Integer> deg = new ArrayList<>(Collections.nCopies(n, 0));

        for(int i=0;i<edges.length;i++){
            deg.set(edges[i][1],(deg.get(edges[i][1])+1));
        }

        List<Integer> deg0 =new ArrayList<>();

        for(int i=0;i<n;i++){
            if(deg.get(i)==0){
                deg0.add(i);
            }
        }

        if(deg0.size()==1){
            return deg0.get(0);
        }
        else{
            return -1;
        }
    }
}
