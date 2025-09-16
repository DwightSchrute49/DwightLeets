class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int a : nums) {
            while (!res.isEmpty()) {
                int last = res.getLast();
                int g = gcd(last, a);
                if (g == 1) break; 
                res.removeLast();
                a = (int) ((long) a * last / g);
            }
            res.add(a);
        }
        return res;
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
