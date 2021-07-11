package com.man.test;

import java.security.SecureRandom;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


  public static void main(String[] args) {
    String[] srArray = new String[]{"eat","tea","tan","ate","nat","bat"};
//    List<String> strs = Arrays.asList(srArray);
//    getOutput(strs);
    List<List<Integer>> matrix = new ArrayList<>();
    List<Integer> integers = new ArrayList<>();
    for (int i=1;i<=2;i++){
      integers.add(i);
    }
    matrix.add(integers);
    integers = new ArrayList<>();
    for (int i=3;i<=4;i++){
      integers.add(i);
    }
    matrix.add(integers);
//    integers = new ArrayList<>();
//    for (int i=7;i<=9;i++){
//      integers.add(i);
//    }
//    matrix.add(integers);

    for(int i=0;i<matrix.size();i++){
      for(int j=0;j<matrix.size();j++){
        System.out.print(matrix.get(i).get(j)+" ");
      }
      System.out.println();
    }

    System.out.println("****************");

    print(matrix);

  }

  private static  void  print(List<List<Integer>> matrix){
    int size = matrix.size();
    int count1 =0;
    int count2 =matrix.size()-1;
    for(int i=0;i<=size;i++){
      for(int j=0;j<=i;j++) {
        int ypivote = size - i - 1 + j;
        int xpivote = j;
        if(i>=size){
          xpivote = j+1;
          ypivote = i-size+j;
        }

        System.out.println(matrix.get(xpivote).get(ypivote));
      }
    }
  }

  private static List<List<String>> getOutput(List<String> strs) {
    List<List<String>> output = new ArrayList<>();
    Map<String, List<String>> map = new HashMap<>();
    strs.forEach(s -> {
      char[] c = s.toCharArray();
      Arrays.sort(c);
      String sortedStr = String.valueOf(c);
      if (!map.containsKey(sortedStr)) {
        List<String> strings = new ArrayList<>();
        strings.add(s);
        map.put(sortedStr, strings);
      } else {
        map.get(sortedStr).add(s);
      }
    });
    for (Map.Entry<String,List<String>> entry: map.entrySet()){
      System.out.println("################");
      output.add(entry.getValue());
      for (String s : entry.getValue()){
        System.out.print(s+" ");
      }
      System.out.println();
      System.out.println("################");
    }
    return output;
  }
}
