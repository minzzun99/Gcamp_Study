package codingtestbook;

import java.util.ArrayList;
import java.util.Collections;
public class Problem04 {
    public static int[] solution(int[] answers) {
        int[][] supoja = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < supoja.length; j++) {
                if (supoja[j][i % supoja[j].length] == answers[i]) {
                    score[j]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = Math.max(max, score[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) {
                list.add(i + 1);
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
