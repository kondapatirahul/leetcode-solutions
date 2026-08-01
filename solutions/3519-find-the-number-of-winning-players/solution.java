class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] counts = new int[n][11];

        for (int[] p : pick) {
            counts[p[0]][p[1]]++;
        }

        int winners = 0;

        for (int i = 0; i < n; i++) {
            for (int color = 0; color <= 10; color++) {
                if (counts[i][color] > i) {
                    winners++;
                    break;
                }
            }
        }

        return winners;
    }
}
