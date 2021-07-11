package com.man.test;

public class CountOfBits {
  public static void main(String[] args) {

    int a = 7;
    int b = 3;

    solve(a,b);
  }

  private static void solve(int a, int b) {
      int n = a*b;
      String s = Integer.toBinaryString(n);
      char[] cs = s.toCharArray();
      int count=0;
      for (int i=0;i<cs.length;i++){
        if(cs[i]=='1'){
          count++;
        }
      }
      System.out.println(count);
  }
}
