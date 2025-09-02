class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
        );
        for (int c [] : classes) {
            int pass = c[0], total = c[1];
            double gain = gain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }
        while (extraStudents-- > 0) {
            double[] top = pq.poll();  
            double pass = top[1], total = top[2];
            pass += 1;
            total += 1;
            double gain = gain((int) pass, (int) total);
            pq.offer(new double[]{gain, pass, total});
        }
        double sum = 0;
        for (double[] c : pq) {
            sum += c[1] / c[2];
        }
        return sum / classes.length;
    }
    private double gain(int pass, int total) {
        return (double)(pass + 1) / (total + 1) - (double)pass / total;
    }
}
