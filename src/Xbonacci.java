public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] fullSequence = new double[n];

        for (int i = 0; i < n; i++) {
            fullSequence[i] = i < s.length ? s[i] : fullSequence[i-3] + fullSequence[i-2] + fullSequence[i-1];
        }

        return fullSequence;
    }
}
