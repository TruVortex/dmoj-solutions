import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int rows = nextInt() + 1;
        int cols = nextInt() + 1;
        int[][] path = new int[rows][cols];
        boolean[][] catSpaces = new boolean[rows][cols];
        for (int i = nextInt(); i > 0; i--) {
            catSpaces[nextInt()][nextInt()] = true;
        }
        path[1][1] = 1;
        catSpaces[1][1] = true;
        for (int i = 1; i < path.length; i++) {
            for (int j = 1; j < path[i].length; j++) {
                if (!catSpaces[i][j]) {
                    path[i][j] = path[i][j - 1] + path[i - 1][j];
                }
            }
        }
        System.out.println(path[rows - 1][cols - 1]);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char nextChar() throws IOException {
        return next().charAt(0);
    }

    static String nextLine() throws IOException {
        return br.readLine().trim();
    }
}