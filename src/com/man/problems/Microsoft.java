package com.man.problems;

public class Microsoft {
  public static void main(String[] args) {
    int a=6;
    int b=20;
  System.out.println(solution(a,b));
  }

  private static int solution(int a,int b) {
    int count=0;
    int i;
    for (i=1; i < a; i++) {
      if (a % i == 0 && a / i - i == 1) {
        break;
      }
    }
    for (int j = i; j <= b; j++) {
      if (j * (j + 1) <= b) {
        count++;
      }
    }
    return count;
  }

}
