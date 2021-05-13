
public class Check {
    boolean check(int n, int[] l) {

        int a, b, m = 0;
        int xy[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                xy[i][j] = l[m];
                m++;
            }
        }
        a = (n - 1) / 3;
        b = (n - 1) % 3;
        // Horizontal
        if (xy[a][0] == xy[a][1] && xy[a][1] == xy[a][2]) {
            return true;
        }
        // Vertical
        else if (xy[0][b] == xy[1][b] && xy[1][b] == xy[2][b]) {
            return true;
        }
        // Cross
        else if (a == b) {
            if (xy[0][0] == xy[1][1] && xy[1][1] == xy[2][2]) {
                return true;
            }
        } else if (a + b == 2) {
            if (xy[0][2] == xy[1][1] && xy[1][1] == xy[2][0]) {
                return true;
            }
        }
        return false;
    }
}
