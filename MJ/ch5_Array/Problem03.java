package codingtestbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(solution(list).toString());
    }

    private static ArrayList<Integer> solution(ArrayList<Integer> list) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                set.add(list.get(i) + list.get(j));
            }
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
}
