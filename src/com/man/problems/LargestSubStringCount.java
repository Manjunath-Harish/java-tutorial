package com.man.problems;

public class LargestSubStringCount {

  public static void main(String[] args) {
    String s1 = "ABCDGH";
    String s2 = "ACDGHR";
    System.out.println(longestCommonSubstr(s1,s2,s1.length(),s2.length()));
  }
  static int longestCommonSubstr(String S1, String S2, int n, int m) {
    int res = 0;
    char[] s1 = S1.toCharArray();
    char[] s2 = S2.toCharArray();

    int dp[][] = new int[n + 1][m + 1];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else if (s1[i - 1] == s2[j - 1]) {
          dp[i][j] = 1 + dp[i - 1][j - 1];

          res = Math.max(res, dp[i][j]);
        } else {
          dp[i][j] = 0;
        }
      }
    }

    return res;
  }
}


