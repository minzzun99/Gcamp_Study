package codingtestbook.ch6;

import java.util.*;

public class Problem10 {
    private static Map<Character, Character> map;
    public static int solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            deque.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            deque.addLast(deque.pollFirst());

            StringBuilder sb = new StringBuilder();
            for (char c : deque) {
                sb.append(c);
            }

            if (isValid(sb.toString())) {
                count++;
            }
        }
        return count;
    }

    private static boolean isValid(String check) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < check.length(); i++) {
            char c = check.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
