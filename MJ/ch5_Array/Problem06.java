package codingtestbook;

import java.util.Arrays;

public class Problem06 {
    private static class Stage {
        int num;
        double failure;

        Stage(int num, double failure) {
            this.num = num;
            this.failure = failure;
        }
    }

    public int[] solution(int N, int[] stages) {
        int num = stages.length;        // 사람 수
        int[] result = new int[N];
        Stage[] failureList = new Stage[N];

        for (int i = 1; i <= N; i++) {
            int fail = 0;
            int success = 0;
            for (int j = 0; j < num; j++) {
                if (stages[j] >= i) {
                    success++;
                    if (stages[j] == i) {
                        fail++;
                    }
                }
            }
            double failureRate = (fail == 0) ? 0 : (double) fail / success;
            failureList[i - 1] = new Stage(i, failureRate);
        }

        Arrays.sort(failureList, (o1, o2) -> Double.compare(o2.failure, o1.failure));
        for (int i = 0; i < N; i++) {
            result[i] = failureList[i].num;
        }
        return result;
    }
}
