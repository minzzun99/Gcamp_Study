package codingtestbook;

import java.util.HashMap;
import java.util.HashSet;

public class Problem07 {
    private static HashMap<Character, int[]> map = new HashMap<>();

    private static void moveDirection() {
        map.put('U', new int[]{0, 1});
        map.put('D', new int[]{0, -1});
        map.put('L', new int[]{-1, 0});
        map.put('R', new int[]{1, 0});
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    public static int solution(String dirs) {
        char[] command = dirs.toCharArray();
        moveDirection();
        int x = 5;
        int y = 5;
        HashSet<String> movePaths = new HashSet<>();

        for (int i = 0; i < command.length; i++) {
            int nx = x + map.get(command[i])[0];
            int ny = y + map.get(command[i])[1];

            if (isValid(nx, ny)) {
                movePaths.add(x + " " + y + " " + nx + " " + ny);
                movePaths.add(nx + " " + ny + " " + x + " " + y);
                x = nx;
                y = ny;
            }
        }
        return movePaths.size() / 2;
    }
}
