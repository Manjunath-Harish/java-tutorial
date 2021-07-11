package com.man.problems.search;

import java.util.Arrays;
import java.util.List;

public class BinarySearchExample{
  public static void binarySearch(int arr[], int first, int last, int key){
    int mid = (first + last)/2;
    String[] srArray = new String[]{"eat","tea","tan","ate","nat","bat"};
    while( first <= last ){
      if ( arr[mid] < key ){
        first = mid + 1;
      }else if ( arr[mid] == key ){
        System.out.println("Element is found at index: " + mid);
        break;
      }else{
        last = mid - 1;
      }
      mid = (first + last)/2;
    }
    if ( first > last ){
      System.out.println("Element is not found!");
    }
  }
  public static void main(String args[]){
    int arr[] = {10,20,30,40,50};
    List a = Arrays.asList(1,2,3,4,5);
    int size =a.size();
    int key = 10;
    int last=arr.length-1;
    binarySearch(arr,0,last,key);
  }
}
