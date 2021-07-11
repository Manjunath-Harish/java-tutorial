package com.man.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlidingWindow {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5, 6));
    int x = 2;
    solve(a, x);
  }

  private static void solve(List<Integer> a, int x) {
    int size = a.size();
    List<Integer> min = new ArrayList<>();
    for (int i=0;i<size-x+1;i++){
      min.add(Collections.min(a.subList(i,i+x)));
    }
    System.out.println(Collections.max(min));
  }
}
