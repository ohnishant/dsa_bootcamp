public class NQueen {
    boolean Board[][];

    public int totalNQeens(int n) {
        Board = new boolean[n][n];
        return solve(0, n);
    }

    int solve(int row, int n) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(Board[i][j] ? "Q " : ". ");
                }
                System.out.println();
            }
            return 1;
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (willPlace(row, col)) {
                Board[row][col] = true;
                count += solve(row + 1, n);
                Board[row][col] = false;

            }
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(Board[i][j] ? "Q " : "__ ");
        // }
        // System.out.println();
        // }
        return count;
    }

    boolean willPlace(int row, int col) {
        // check same column in the
        for (int i = row; i >= 0; i--) {
            if (Board[i][col]) {
                return false;
            }
        }
        // Check left upper diag
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j]) {
                return false;
            }
        }

        // check right upper diag
        for (int i = row, j = col; i >= 0 && j < Board.length; i--, j++) {
            if (Board[i][j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NQueen obj = new NQueen();
        System.out.println(obj.totalNQeens(4));
    }
}
