package nguyenxuannghia_20001954_homework1;

public class ComputePI {

    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 100000;
        final int MAX_TERM = 10000;

        double pi = computePI(MAX_DENOMINATOR);
        double piMaxTerm = computePIMaxTerm(MAX_TERM);
        double accuratePI = (pi / Math.PI) * 100;
        double accuratePIMaxTerm = (piMaxTerm / Math.PI) * 100;

        System.out.println("Compute pi: " + pi);
        System.out.println("Compute pi max term: " + piMaxTerm);
        System.out.println("Độ chính xác của compute pi là: " + accuratePI + " %");
        System.out.println("Độ chính xác của compute pi là: " + accuratePIMaxTerm + " %");
    }

    public static double computePI(int maxDenominator) {
        double pi = 0.0;

        for (int denominator = 1; denominator <= maxDenominator; denominator+=2) {
            if (denominator % 4 == 1 ) {
                pi += (double) 4 / denominator;
            } else if ( denominator % 4 == 3) {
                pi -= (double) 4 / denominator;
            }
        }
        return pi;
    }

    public static double computePIMaxTerm(int maxTerm) {
        double sum = 0.0;

        for (int term = 1; term <= maxTerm; term ++) {
            if (term % 2 == 1 ) {
                sum += (double) 1 / (term * 2 - 1);
            } else {
                sum -= (double) 1 / (term * 2 - 1);
            }
        }
        return 4 * sum;
    }

}
