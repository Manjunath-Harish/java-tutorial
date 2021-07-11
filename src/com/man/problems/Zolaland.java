package com.man.problems;

import java.util.Arrays;
import java.util.List;

public class Zolaland {
  public static void main(String[] args) {
    String s = "505527238";
    System.out.println(greatestTwoDigitNumber(s));

    int[] cost = {5,2,4,6,3,7};//0,1,2,3,4,5
    System.out.println(minimalCostBreak(cost));
  }

  private static int minimalCostBreak(int[] cost) {
    int min=Integer.MAX_VALUE;
    for(int p=1;p<cost.length-3;p++){
      for (int q=p+2;q<cost.length-1;q++){
        min = Math.min(min,cost[p]+cost[q]);
      }
    }
    return min;
  }

  private static int greatestTwoDigitNumber(String s){
    char[] sa = s.toCharArray();
    int max=0;
    for (int i=0;i<sa.length-1;i++){
      max = Math.max(max,Integer.parseInt(sa[i] +String.valueOf(sa[i+1])));
    }
    return max;
  }
}
