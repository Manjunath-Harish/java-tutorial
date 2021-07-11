package com.man.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

  public static void main(String[] args) {
    List<String> a = Arrays.asList("abbd","mn","abc","jk");
    List<String> b = Arrays.asList("bbce","op","bbc","kj");

    process(a,b);
  }

  private static void process(List<String> a, List<String> b) {
    for (int i = 0; i < a.size(); i++) {
      int r = -1;
      if (a.get(i).length() == b.get(i).length()) {
        r = 0;
        char[] s1 = a.get(i).toCharArray();
        char[] s2 = b.get(i).toCharArray();
      //  List<Character> list = Arrays.asList(a.get(i).toCharArray());
        int size = s1.length;
        int k = 0;
        int j = 0;
        boolean entered=false;
        for (j = 0; j < size && k < size; j++, k++) {
          if (s1[j] != s2[k]) {
            entered = true;
            if (s1[j] > s2[k]) {
              j--;
            } else {
              k--;
            }
          }
        }
        if(k==j&&entered){
          r=1;
        }else if(k>j){
          r=k-j;
        }else if(k<j){
          r=j-k;
        }
      }
      System.out.println(r);
    }
  }
}
