import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<Integer> money = new Stack();
        int n = nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = nextInt();
            if (num == 0) {
                money.pop();
            } else {
                money.push(num);
            }
        }
        while (!money.isEmpty()) {
            sum += money.pop();
        }
        System.out.println(sum);
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
