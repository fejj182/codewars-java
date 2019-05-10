import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        ArrayList<Double> numberList = new ArrayList<>();
        for (double d : s) {
            numberList.add(d);
        }

        for (int i = numberList.size(); i < n; i++) {
            numberList.add(getNextNumber(new double[]{numberList.get(i-3), numberList.get(i-2), numberList.get(i-1)}));
        }

        Double[] d = new Double[numberList.size()];
        numberList.toArray(d);

        double[] unboxed = Stream.of(d).mapToDouble(Double::doubleValue).toArray();

        return unboxed;
    }

    public double getNextNumber(double[] s) {
        return Arrays.stream(s).sum();
    }
}
