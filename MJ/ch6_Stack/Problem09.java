package codingtestbook.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(solution(num));
    }

    private static String solution(int num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
