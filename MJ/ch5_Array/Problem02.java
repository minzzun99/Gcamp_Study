package codingtestbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem02 {
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
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : list) {
            set.add(i);
        }
        result.addAll(set);
        return result;
    }
}
