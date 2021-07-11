package com.man.test;

public class Summer {
  public static void main(String[] args) {
    int a[] = {-3,-14,-5,7,8,42,8,3};
    int b[] = {2,-3,3,1,10,8,2,5,13,-5,3,-18};


    response(b);
  }

  private static void response(int[] a) {
    int size = a.length;
    int rSize = size/4;
    int maxMean = 0;
    int temp = 0;
    int index = 0;
    for (int i = 0; i < size; i += rSize) {
      int min = a[i];
      int max = a[i];
      for(int j=i;j<rSize+i;j++){
        if(a[j]>max){
          max=a[j];
        }
        if(a[j]<min){
          min=a[j];
        }
      }
      if ((min > 0 && max > 0) || (min < 0 && max < 0)) {
        temp = Math.abs(min) - Math.abs(max);
        temp = Math.abs(temp);
      } else {
        temp = Math.abs(min) + Math.abs(a[i +1]);
      }

      if (temp > maxMean) {
        maxMean = temp;
        index = i;
      }
    }
    String[] s = {"A","B","C","D"};
    System.out.println(s[index/rSize]);
  }
}
