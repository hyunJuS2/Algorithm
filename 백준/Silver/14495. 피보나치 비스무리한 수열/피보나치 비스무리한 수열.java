import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] dp = new long[Math.max(4, N + 1)];
        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 3];
        }

        System.out.println(dp[N]);
    }
}
