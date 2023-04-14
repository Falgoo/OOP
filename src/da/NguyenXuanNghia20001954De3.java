package da;

public class NguyenXuanNghia20001954De3 {

    public static void main(String[] args) {
        int[] a = {6,5,1,2,1,1};
        System.out.println(getMaxValue(a));
    }

    public static int getMaxValue(int[] v) {
        int min = 0;
        int max = 0;

        for (int j : v) {
            min += j;
            max += j;
        }

        for (int i = 0; i < v.length; i++) {
            int sum = 0;
            int value = v[i];

            for (int j = 0; j < v.length; j++) {
                if (value == v[j] && value > 0) {
                    sum += v[j];
                    v[j] = 0;
                }
            }

            if (min > sum && sum > 0) {
                min = sum;
            }
        }
        return max - min;
    }
}
