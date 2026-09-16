public class QueensAttackII {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {

        // 1. Initial max distances to board edges without obstacles
        int up = n - r_q;
        int down = r_q - 1;
        int right = n - c_q;
        int left = c_q - 1;

        int upRight = Math.min(up, right);
        int upLeft = Math.min(up, left);
        int downRight = Math.min(down, right);
        int downLeft = Math.min(down, left);

        // 2. Trim distances using obstacles
        for (List<Integer> obstacle : obstacles) {
            int r_o = obstacle.get(0);
            int c_o = obstacle.get(1);

            // Vertical checks
            if (c_o == c_q) {
                if (r_o > r_q)
                    up = Math.min(up, r_o - r_q - 1);
                else if (r_o < r_q)
                    down = Math.min(down, r_q - r_o - 1);
            }
            // Horizontal checks
            else if (r_o == r_q) {
                if (c_o > c_q)
                    right = Math.min(right, c_o - c_q - 1);
                else if (c_o < c_q)
                    left = Math.min(left, c_q - c_o - 1);
            }
            // Diagonal checks (|r_diff| == |c_diff|)
            else if (Math.abs(r_o - r_q) == Math.abs(c_o - c_q)) {
                int d = Math.abs(r_o - r_q) - 1;

                if (r_o > r_q && c_o > c_q)
                    upRight = Math.min(upRight, d);
                else if (r_o > r_q && c_o < c_q)
                    upLeft = Math.min(upLeft, d);
                else if (r_o < r_q && c_o > c_q)
                    downRight = Math.min(downRight, d);
                else if (r_o < r_q && c_o < c_q)
                    downLeft = Math.min(downLeft, d);
            }
        }

        // 3. Total attackable squares
        return up + down + right + left + upRight + upLeft + downRight + downLeft;
    }
}